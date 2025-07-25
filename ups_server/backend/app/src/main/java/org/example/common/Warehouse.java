package org.example.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "warehouses")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "warehouse_id", nullable = false)
    private Integer warehouseId;

    @Column(name = "warehouse_x", nullable = false)
    private Integer warehouseX;

    @Column(name = "warehouse_y", nullable = false)
    private Integer warehouseY;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getWarehouseX() {
        return warehouseX;
    }

    public void setWarehouseX(Integer warehouseX) {
        this.warehouseX = warehouseX;
    }

    public Integer getWarehouseY() {
        return warehouseY;
    }

    public void setWarehouseY(Integer warehouseY) {
        this.warehouseY = warehouseY;
    }
}
