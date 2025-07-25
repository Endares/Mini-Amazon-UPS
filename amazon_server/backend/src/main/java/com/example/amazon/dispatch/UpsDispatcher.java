package com.example.amazon.dispatch;

/* 需要的 import */
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import com.example.amazon.client.WorldClient;
import com.example.amazon.connection.ConnectionManager;
import com.example.amazon.proto.AmazonUpsProto.ABookTruck;
import com.example.amazon.proto.AmazonUpsProto.AInformWorld;
import com.example.amazon.proto.AmazonUpsProto.AStartDeliver; // Replace with the actual package of ConnectionManager
import com.example.amazon.proto.AmazonUpsProto.AUCommunication; // Import the UTruckArrived class
import com.example.amazon.proto.AmazonUpsProto.UACommunication;    // Import the UDelivered class
import com.example.amazon.proto.AmazonUpsProto.UDelivered;       // Import the ABookTruck class
import com.example.amazon.proto.AmazonUpsProto.UReceivedWorld;
import com.example.amazon.proto.AmazonUpsProto.UTruckArrived; // Import the UReceivedWorld class
import com.example.amazon.proto.ProtoCodec; // Import the WorldClient class



@Component
public class UpsDispatcher implements SmartLifecycle {
    private final ConnectionManager connMgr;     // 复用你已有的封装
    private final ProtoCodec        codec;       // 同一个 codec
    private WorldContext ctx; // 复用你已有的上下文
    private final WorldClient worldClient; // 复用你已有的 WorldClient
    private final AtomicLong seqGen = new AtomicLong();
    private final ConcurrentMap<Long, CompletableFuture<UACommunication>> pending = new ConcurrentHashMap<>();
    private final ConcurrentMap<Long, CompletableFuture<UTruckArrived>> arrivalFut
        = new ConcurrentHashMap<>();
        private final ConcurrentMap<Long, CompletableFuture<UDelivered>> deliveredFut =
        new ConcurrentHashMap<>();
    private final ExecutorService exec = Executors.newSingleThreadExecutor();
    private final Set<Long> processed = ConcurrentHashMap.newKeySet();
    private final Object sendLock = new Object(); 
    private volatile boolean running = false;

    private static final int MAX_RETRY = 3000;          // 尝试 3 次
    private static final long RETRY_MS  = 2000;       // 每次间隔 2 秒

    public UpsDispatcher(@Qualifier("upsConn")ConnectionManager connMgr, 
                ProtoCodec codec, 
                WorldContext ctx, 
                WorldClient worldClient) {
        this.ctx     = ctx;
        this.connMgr = connMgr;
        this.codec   = codec;
        this.worldClient = worldClient;
    }
    
    // =========================
    // SmartLifecycle 接口实现
    // =========================
    @Override 
    public void start() {
        for (int attempt = 1; attempt <= MAX_RETRY; attempt++) {
            try {
                connMgr.connect();          // 尝试连 UPS
                sendInformWorld();          // 握手
                running = true;
                exec.submit(this::listenLoop);
                return;                     // 成功就退出 start()
            } catch (Exception e) {
                System.err.printf(
                    "[UPS] connect failed (%d/%d): %s%n",
                    attempt, MAX_RETRY, e.getMessage());
                connMgr.close();         // 关闭连接
                try { Thread.sleep(RETRY_MS); } catch (InterruptedException ie) { }
            }
        }
        // throw new IllegalStateException("UPS connection failed");
    }

    @Override public void stop() {
        running = false;
        connMgr.close();
    }
    @Override public boolean isRunning()     { return running; }
    @Override public boolean isAutoStartup() { return true; }
    @Override public int      getPhase()     { return Integer.MAX_VALUE; }


    // =========================
    // 业务逻辑
    // =========================
    private void sendInformWorld() throws IOException {
        AInformWorld inf = AInformWorld.newBuilder()
                                    .setWorldid(ctx.getWorldId())
                                    .build();
        synchronized (sendLock) { codec.send(connMgr.getOut(), inf); }
        UReceivedWorld ack = codec.receive(connMgr.getIn(), UReceivedWorld.parser());
        if (ack.getWorldid() != ctx.getWorldId())
            throw new IllegalStateException("UPS returned wrong worldId");
        System.out.println("[UPS] handshake ok, worldId=" + ack.getWorldid());
    }

    private CompletableFuture<UACommunication> register(long seq) {
        CompletableFuture<UACommunication> f = new CompletableFuture<>();
        pending.put(seq, f);
        return f;
    }

    /* ======== 主循环 ======== */
    private void listenLoop() {
        System.out.println("[UPS] listenLoop started");
        while (running) {
            try {
                UACommunication ua = codec.receive(connMgr.getIn(),
                                                UACommunication.parser());

                /* (a) UTruckArrived */
                ua.getArrivedList().forEach(arr -> {
                    long seq = arr.getSeqnum();
                    if (!processed.add(seq)) { sendAck(seq); return; }
                    handleTruckArrived(arr);     // TODO: 业务
                    sendAck(seq);
                });

                /* (b) UDelivered */
                ua.getDeliveredList().forEach(del -> {
                    long seq = del.getSeqnum();
                    if (!processed.add(seq)) { sendAck(seq); return; }
                    handleDelivered(del);        // TODO: 业务
                    sendAck(seq);
                });

                /* (c) UPS 对我们订车请求的 ACK  */
                if (ua.hasAcks()) {
                    long ack = ua.getAcks();
                    CompletableFuture<UACommunication> f = pending.remove(ack);
                    if (f != null) f.complete(ua);    // 让 bookTruckAsync() 的 future 完成
                }

            } catch (EOFException e) {
                System.err.println("UPS closed socket - exit listenLoop");
                break;
            } catch (SocketTimeoutException e) {
                continue;                            // 读超时，继续等
            } catch (IOException e) {
                handleIoError(e);                    // 重连 + fail 未完成
            } catch (Exception e) {
                handleIoError(e);
            }
        }
    }

    public CompletableFuture<UTruckArrived> waitTruckArrivedAsync(long pkgId) {
        return arrivalFut.computeIfAbsent(pkgId, k -> new CompletableFuture<>());
    }

    /* ======== 私有工具 ======== */
    // 1) 线程安全发 ACK
    private void sendAck(long seq) {
        AUCommunication ackMsg = AUCommunication.newBuilder()
                                                .setAcks(seq)
                                                .build();
        synchronized (sendLock) {
            try { 
                codec.send(connMgr.getOut(), ackMsg); 
            } catch (IOException e) {
                System.err.println("⚠️  sendAck failed seq=" + seq + ": " + e.getMessage());
            }
        }
        
    }

    // 2) 处理网络错误：重连 + 失败未完成的 future
    private void reconnectAndClearPending() {
        connMgr.reconnect();
        pending.forEach((id,f)->f.completeExceptionally(
            new IOException("connection reset")));
        pending.clear();
        /* processed 可留着，也可清空；留着可避免重连后同 seqnum 重复处理 */
    }

    private void handleTruckArrived(UTruckArrived arr) {
        long pkgId   = arr.getPackageid();
        int truckId = arr.getTruckid();
        System.out.printf("[UPS] truck %d arrived, pkg=%d%n", truckId, pkgId);

        CompletableFuture<UTruckArrived> fut = arrivalFut.remove(pkgId);
        if (fut != null) fut.complete(arr); 
        sendAck(arr.getSeqnum());               
    }

    /* IO 异常集中处理 */
    private void handleIoError(Exception e) {
        System.err.println("⚠️  UPS IO error: " + e.getMessage() + " – reconnecting");
        reconnectAndClearPending();
    }

    private void handleDelivered(UDelivered del) {
        long pkgId = del.getPackageid();
        System.out.printf("[UPS] delivered pkg=%d%n", pkgId);

        CompletableFuture<UDelivered> fut = deliveredFut.remove(pkgId);
        if (fut != null) fut.complete(del);      // 唤醒 Service

        sendAck(del.getSeqnum());
    }


    public CompletableFuture<UACommunication> bookTruckAsync(long pkgId,
                                                         int whId, int wx, int wy,
                                                         int dx,   int dy) {
        long seq = seqGen.getAndIncrement();

        ABookTruck req = ABookTruck.newBuilder()
                                .setPackageid(pkgId)
                                .setWarehouseid(whId)
                                .setWarehousex(wx)
                                .setWarehousey(wy)
                                .setDestinationx(dx)
                                .setDestinationy(dy)
                                .setSeqnum(seq)
                                .build();

        AUCommunication cmd = AUCommunication.newBuilder()
                                            .addBookings(req)
                                            .build();

        CompletableFuture<UACommunication> fut = register(seq);
        try {
            synchronized (sendLock) { codec.send(connMgr.getOut(), cmd); }   // 只发送，不阻塞
        } catch (Exception e) {
            pending.remove(seq);
            fut.completeExceptionally(e);
        }
        return fut;                              // 调用方决定 join 还是链式
    }

    public CompletableFuture<UDelivered> waitDeliveredAsync(long pkgId) {
        return deliveredFut.computeIfAbsent(pkgId, k -> new CompletableFuture<>());
    }

/* 发送 AStartDeliver，返回 ACK-future */
    public CompletableFuture<UACommunication> startDeliverAsync(long pkgId) {
        long seq = seqGen.getAndIncrement();

        AStartDeliver sd = AStartDeliver.newBuilder()
                                        .setPackageid(pkgId)
                                        .setSeqnum(seq)
                                        .build();
        AUCommunication cmd = AUCommunication.newBuilder()
                                            .addDelivers(sd)
                                            .build();

        CompletableFuture<UACommunication> fut = register(seq);   // 你已有的方法
        try { synchronized (sendLock) { codec.send(connMgr.getOut(), cmd); } }
        catch (Exception e) { pending.remove(seq); fut.completeExceptionally(e); }
        return fut;
    }

}
