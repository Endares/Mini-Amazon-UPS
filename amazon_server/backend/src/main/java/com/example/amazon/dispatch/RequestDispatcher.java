package com.example.amazon.dispatch;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.Instant;
import java.util.Optional;
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

import com.example.amazon.connection.ConnectionManager;
import com.example.amazon.entity.Product;
import com.example.amazon.exceptions.WorldConnectionException;
import com.example.amazon.proto.AmazonProto.ACommands;
import com.example.amazon.proto.AmazonProto.AConnect;
import com.example.amazon.proto.AmazonProto.AConnected;
import com.example.amazon.proto.AmazonProto.AInitWarehouse;
import com.example.amazon.proto.AmazonProto.APack;
import com.example.amazon.proto.AmazonProto.AProduct;
import com.example.amazon.proto.AmazonProto.APurchaseMore;
import com.example.amazon.proto.AmazonProto.APutOnTruck;
import com.example.amazon.proto.AmazonProto.AResponses;
import com.example.amazon.proto.ProtoCodec;
import com.example.amazon.repo.ProductRepository;

@Component
public class RequestDispatcher implements SmartLifecycle {
    private static final long TIMEOUT_MS = 15000;
    private final ConnectionManager connMgr;
    private final ProtoCodec codec;
    private final ProductRepository productRepository;
    private WorldContext ctx;
    private final ConcurrentMap<Long, CompletableFuture<AResponses>> pending = new ConcurrentHashMap<>();
    // 已经处理过、并发送过 ACK 的 seqnum
    private final Set<Long> processed = ConcurrentHashMap.newKeySet();
    // 复用一把锁，避免多线程同时发 ACK 冲突
    private final Object ackLock = new Object();
    private final AtomicLong seqGen = new AtomicLong();
    private final ExecutorService exec = Executors.newSingleThreadExecutor();
    private volatile boolean running = false;

    public RequestDispatcher(@Qualifier("worldConn")ConnectionManager connMgr,
                             ProtoCodec codec,
                             ProductRepository productRepository,
                             WorldContext ctx) {
        this.ctx = ctx;
        this.connMgr = connMgr;
        this.codec = codec;
        this.productRepository = productRepository;
    }

    // =========================
    // SmartLifecycle 接口实现
    // =========================
    @Override        
    public void start() {
        try {
            connMgr.connect();              // open socket
            sendAConnect();                 // handshake
            running = true;
            exec.submit(this::listenLoop);  // run in background
        } catch (Exception ex) {
            stop();                         // ensure clean‑up on failure
            throw new IllegalStateException("Cannot start dispatcher", ex);
        }
    }
    
    @Override
    public void stop() {
        running = false; // breaks listenLoop
        exec.shutdownNow();
        connMgr.close();
    }

    @Override public boolean isRunning()      { return running; }
    @Override public boolean isAutoStartup()  { return true; }   // start automatically
    @Override public int      getPhase()      { return Integer.MAX_VALUE; } // start last
    
    // =========================
    // 业务逻辑
    // =========================

    /**
     * Send AConnect to world and wait for AConnected.
     * @throws WorldConnectionException if handshake fails
     */
    private void sendAConnect() throws IOException { // Declare IOException in method signature
        AConnect req = AConnect.newBuilder()
            .addInitwh(
                AInitWarehouse.newBuilder()
                    .setX(0)
                    .setY(0)
                    .setId(1)
                    .build()
            )
            .setIsAmazon(true).build();
        codec.send(connMgr.getOut(), req);

        AConnected ack = codec.receive(connMgr.getIn(), AConnected.parser());
        if (!"connected!".equals(ack.getResult()))
            throw new WorldConnectionException("Handshake failed: "+ack.getResult());
        ctx.setWorldId(ack.getWorldid()); // Store the worldId
        System.out.println("AConnected worldId="+ctx.getWorldId());
    }

    /**
     * Listen for incoming messages from the world.
     * This method runs in a separate thread.
     * It reads messages from the socket and processes them.
     * It handles exceptions and reconnects if necessary.
     * It also sends ACKs for received messages.
     * 
     */
    private void listenLoop() {
        System.out.println("[client] entering listenLoop at " + Instant.now());
        while (true) {
            try {
                AResponses resp = codec.receive(connMgr.getIn(), AResponses.parser());
                // 1) 完成 ack future
                completeFutures(resp);
                processArrived(resp);

                // === 新增 ===
                // resp.getReadyList().forEach(r -> {
                //     long seq = r.getSeqnum();
                //     CompletableFuture<AResponses> f = pending.remove(seq);
                //     if (f != null) f.complete(resp);
                // });
                // resp.getLoadedList().forEach(l -> {
                //     long seq = l.getSeqnum();
                //     CompletableFuture<AResponses> f = pending.remove(seq);
                //     if (f != null) f.complete(resp);
                // });

                /* 抽象后的一行：ready */
                completeBySeq(resp.getReadyList(),  r -> r.getSeqnum(), resp);

                /* 抽象后的一行：loaded */
                completeBySeq(resp.getLoadedList(), l -> l.getSeqnum(), resp);
                completeBySeq(resp.getErrorList(),  e -> e.getSeqnum(), resp);
            } catch (EOFException e) {
                // EOF == 对端关闭；别重连，让外层逻辑决定
                System.err.println("World closed the socket (EOF) - stopping listener");
                break;
            } catch (SocketTimeoutException e) {
                // 读超时了，说明这段时间内没有任何响应，继续循环等待
                continue;
            } catch (IOException e) {
                // 真正的 IO 错误，才需要重连并把未完成的 future 标注失败
                System.err.println("⚠️ listenLoop IOException, reconnecting: " + e.getMessage());
                connMgr.reconnect();
                pending.forEach((k, f) -> f.completeExceptionally(e));
                pending.clear();
            } catch (Exception e) {
                // 其它异常也要重连
                System.err.println("⚠️ listenLoop unexpected error, reconnecting: " + e.getMessage());
                connMgr.reconnect();
                pending.forEach((k, f) -> f.completeExceptionally(e));
                pending.clear();
            }
        }
    }

    /** 把具有 seqnum 的列表统一用来完成 pending future */
    private <T> void completeBySeq(Iterable<T> msgs,
                                java.util.function.Function<T, Long> seqFn,
                                AResponses resp) {
        for (T m : msgs) {
            long seq = seqFn.apply(m);
            CompletableFuture<AResponses> fut = pending.remove(seq);
            if (fut != null) fut.complete(resp);
            sendAck(seq);
        }
    }

    private void completeFutures(AResponses resp) {
        for (long ack : resp.getAcksList()) {
            CompletableFuture<AResponses> f = pending.remove(ack);
            if (f != null) f.complete(resp);
        }
    }

    private CompletableFuture<AResponses> register(long seq) {
        CompletableFuture<AResponses> f = new CompletableFuture<>();
        pending.put(seq, f);
        return f;
    }

    private void processArrived(AResponses resp) {
        for (APurchaseMore purchase : resp.getArrivedList()) {
            long seq = purchase.getSeqnum();
            // -------- 去重 --------
            if (!processed.add(seq)) {          // 已处理过
                sendAck(seq);                  // 但还是再 ACK 一次，保险
                continue;
            }
            for (AProduct prod : purchase.getThingsList()) {
                handleArrived(prod);
            }
            sendAck(seq);
        }
    }

    private void handleArrived(AProduct arr) {
        long pid = arr.getId();
        int cnt = arr.getCount();
        Optional<Product> opt = productRepository.findById(pid);
        if (opt.isPresent()) {
            Product p = opt.get();
            p.setCount(p.getCount() + cnt);
            productRepository.save(p);
        } else {
            Product p = new Product();
            p.setDescription(arr.getDescription());
            p.setCount(cnt);
            productRepository.save(p);
        }
    }

    /** 发送对 world 消息的 ACK（Amazon -> World） */
    private void sendAck(long seq) {
        // World 协议：在 ACommands 的 acks 字段里回传
        ACommands ackCmd = ACommands.newBuilder()
                .addAcks(seq)
                .build();
        try {
            // 保证串行写 socket
            synchronized (ackLock) {
                codec.send(connMgr.getOut(), ackCmd);
            }
        } catch (IOException e) {
            System.err.println("⚠️  发送 ACK 失败 seq=" + seq + " : " + e.getMessage());
        }
    }

    /**
     *
     */
    public CompletableFuture<AResponses> executeBuyAsync(int wh,
                                                     long productId,
                                                     String desc,
                                                     int count) {
        long seq = seqGen.getAndIncrement();

        AProduct prod = AProduct.newBuilder()
                                .setId(productId)
                                .setDescription(desc)
                                .setCount(count)
                                .build();

        APurchaseMore buy = APurchaseMore.newBuilder()
                                        .setWhnum(wh)
                                        .addThings(prod)
                                        .setSeqnum(seq)
                                        .build();

        ACommands cmds = ACommands.newBuilder()
                                .addBuy(buy)
                                .build();

        CompletableFuture<AResponses> fut = register(seq);
        try {
            codec.send(connMgr.getOut(), cmds);   // 只发，不阻塞
        } catch (Exception e) {
            pending.remove(seq);
            fut.completeExceptionally(e);
        }
        return fut;   // 让调用方决定同步/异步
    }

    public CompletableFuture<AResponses> executePackAsync(int wh, long shipId) {
        long seq = seqGen.getAndIncrement();

        APack pack = APack.newBuilder()
                        .setWhnum(wh)
                        .setShipid(shipId)
                        .setSeqnum(seq)
                        .build();

        ACommands cmds = ACommands.newBuilder()
                                .addTopack(pack)
                                .build();

        CompletableFuture<AResponses> fut = register(seq);
        try {
            codec.send(connMgr.getOut(), cmds);
        } catch (Exception e) {
            pending.remove(seq);
            fut.completeExceptionally(e);
        }
        return fut;
    }

    public CompletableFuture<AResponses> executeLoadAsync(int wh, long shipId, int truckId){
        long seq = seqGen.getAndIncrement();
        System.out.println("[DISP] executeLoadAsync seq=" + seq + " wh=" + wh + " ship=" + shipId + " truck=" + truckId);
        APutOnTruck load = APutOnTruck.newBuilder()
                        .setWhnum(wh).setShipid(shipId).setTruckid(truckId)
                        .setSeqnum(seq).build();
        ACommands cmd = ACommands.newBuilder()
                                .addLoad(load)
                                .build();
        CompletableFuture<AResponses> fut = register(seq);
        try { 
            codec.send(connMgr.getOut(), cmd);
        } catch(Exception e) { 
            pending.remove(seq); 
            System.err.println("[DISP] send load failed seq=" + seq);
            e.printStackTrace();
            fut.completeExceptionally(e);
        }
        return fut;
    }

}
