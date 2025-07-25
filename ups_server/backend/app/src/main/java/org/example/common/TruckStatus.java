package org.example.common;
public enum TruckStatus {
    IDLE,
    TRAVELING,      // when receives pickups requests and is on its way to warehouse
    ARRIVED,        // arrived at warehouse
    LOADING,        // loading package, after loading package finish, go back to “arrive warehouse” status
    DELIVERING;     // out for delivering packets. when finished all deliver job, go to status “idle”
};