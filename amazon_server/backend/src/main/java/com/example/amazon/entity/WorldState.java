// src/main/java/com/example/amazon/entity/WorldState.java
package com.example.amazon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "world_state")
public class WorldState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "world_id", nullable = false)
    private Long worldId;

    @Column(name = "num_warehouse", nullable = false)
    private int numWh; // number of warehouses

    @Column(name = "warehouse_x", nullable = false)
    private int whX;
    
    @Column(name = "warehouse_y", nullable = false)
    private int whY; // coordinates of the warehouse

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorldId() {
        return worldId;
    }

    public void setWorldId(Long worldId) {
        this.worldId = worldId;
    }

    public int getNumWh() {
        return numWh;
    }
    public void setNumWh(int numWh) {
        this.numWh = numWh;
    }
    public int getWhX() {
        return whX;
    }
    public void setWhX(int whX) {
        this.whX = whX;
    }

    public int getWhY() {
        return whY;
    }
}
