package com.example.amazon.client;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Component;

import com.example.amazon.dispatch.UpsDispatcher;
import com.example.amazon.proto.AmazonUpsProto.UACommunication;
import com.example.amazon.proto.AmazonUpsProto.UDelivered;
import com.example.amazon.proto.AmazonUpsProto.UTruckArrived;
@Component
public class UpsClient {

    private final UpsDispatcher dispatcher;

    public UpsClient(UpsDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    /* --------- 订车：异步版 --------- */
    public CompletableFuture<UACommunication> bookTruckAsync(long pkgId,
                                                             int  whId,
                                                             int  wx, int wy,
                                                             int  dx, int dy) {
        return dispatcher.bookTruckAsync(pkgId, whId, wx, wy, dx, dy);
    }
    public CompletableFuture<UTruckArrived> waitTruckArrivedAsync(long pkgId) {
        return dispatcher.waitTruckArrivedAsync(pkgId);
    }

    /* --------- 同步包装 --------- */
    public void bookTruck(long pkgId,
                          int  whId, int wx, int wy,
                          int  dx,   int dy) {
        bookTruckAsync(pkgId, whId, wx, wy, dx, dy).join();
    }

    /* 开始送货 */
    public CompletableFuture<UACommunication> startDeliverAsync(long pkgId) {
        return dispatcher.startDeliverAsync(pkgId);
    }

    /* 等待 Delivered */
    public CompletableFuture<UDelivered> waitDeliveredAsync(long pkgId) {
        return dispatcher.waitDeliveredAsync(pkgId);
    }


}
