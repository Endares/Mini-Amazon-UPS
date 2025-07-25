// src/main/java/com/example/amazon/WorldClient.java
package com.example.amazon.client;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Component;

import com.example.amazon.dispatch.RequestDispatcher;
import com.example.amazon.proto.AmazonProto.AResponses;



@Component
public class WorldClient {
    private final RequestDispatcher dispatcher;

    public WorldClient(RequestDispatcher dispatcher) { this.dispatcher = dispatcher; }

    /* ---------- buy ---------- */
    public long buy(int wh, long pid, String desc, int cnt) {
        dispatcher.executeBuyAsync(wh, pid, desc, cnt).join();   // 同步包装
        return pid;
    }

    /* ---------- pack ---------- */
    /** 异步：返回 ready ACK 的 Future */
    public CompletableFuture<AResponses> packAsync(int wh, long shipmentId) {
        return dispatcher.executePackAsync(wh, shipmentId);
    }
    /** 同步：阻塞到 ready */
    public String pack(int wh, long shipmentId) {
        packAsync(wh, shipmentId).join();
        System.out.printf("Packing shipment %d in warehouse %d%n", shipmentId, wh);
        return "PACK_OK";
    }

    /* ---------- load ---------- */
    public CompletableFuture<AResponses> loadAsync(int wh, long shipmentId, int truckId) {
        return dispatcher.executeLoadAsync(wh, shipmentId, truckId);   // ❶ 记得在 RequestDispatcher 实现 executeLoadAsync
    }
    public String load(int wh, long shipmentId, int truckId) {
        loadAsync(wh, shipmentId, truckId).join();
        System.out.printf("Loading shipment %d onto truck %d%n", shipmentId, truckId);
        return "LOAD_OK";
    }

}