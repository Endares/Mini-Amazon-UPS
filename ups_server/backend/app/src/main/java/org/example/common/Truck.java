package org.example.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trucks")
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "truck_id", nullable = false, unique = true)
    private Integer truckId;

    @Column(name = "x", nullable = false)
    private Integer x;
    
    @Column(name = "y", nullable = false)
    private Integer y;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "isArrived")
    private Boolean isArrived;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsArrived() {
        return isArrived;
    }

    public void setIsArrived(Boolean isArrived) {
        this.isArrived = isArrived;
    }
}
