package com.example.amazon.enums;
/**
 * OrderStatus.java
 * 
 * This enum represents the status of an order in the system.
 * It includes various states such as PENDING, SHIPPED, DELIVERED, and CANCELED.
 */
public enum OrderStatus {
    CREATED, // Initial state when the order is created
    ORDERED, // Order has been placed
    PACKED, // Order has been packed
    WAITING_TRUCK, // Order is waiting for shipment
    LOADING, // Order is being loaded onto the truck
    SHIPPED, // Order has been shipped
    DELIVERED, // Order has been delivered
    CANCELLED; // Order has been canceled
}