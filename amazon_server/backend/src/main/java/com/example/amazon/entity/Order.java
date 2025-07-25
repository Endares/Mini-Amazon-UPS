// src/main/java/com/example/amazon/entity/Order.java
package com.example.amazon.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.amazon.enums.OrderStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="orders")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int destX, destY;
    private long shipmentId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status; // Represents the status of the order
    private LocalDateTime createdAt;

    @OneToMany(mappedBy="order", cascade=CascadeType.ALL)
    private List<OrderItem> items = new ArrayList<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getDestX() {
        return destX;
    }
    public void setDestX(int destX) {
        this.destX = destX;
    }
    public int getDestY() {
        return destY;
    }
    public void setDestY(int destY) {
        this.destY = destY;
    }
    public long getShipmentId() {
        return shipmentId;
    }
    public void setShipmentId(long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public void addItem(OrderItem item) {
        items.add(item);
        item.setOrder(this);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
        item.setOrder(null);
    }
    public void clearItems() {
        for (OrderItem item : items) {
            item.setOrder(null);
        }
        items.clear();
    }
    
}
