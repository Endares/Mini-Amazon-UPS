package org.example.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipments")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "package_id", nullable = false, unique = true)
    private Long packageId;

    @Column(name = "warehouse_id", nullable = false)
    private Integer warehouseId;

    @Column(name = "warehouse_x", nullable = false)
    private Integer warehouseX;

    @Column(name = "warehouse_y", nullable = false)
    private Integer warehouseY;

    @Column(name = "destination_x", nullable = false)
    private Integer destinationX;

    @Column(name = "destination_y", nullable = false)
    private Integer destinationY;

    //ups required only when Amazon provided
    @Column(name = "ups_id")
    private String upsId;

    // packing, packed, loading, loaded, delivering, delivered.
    @Column(name = "status", nullable = false)
    private String status;

    //truck can be null, since it can be in "packed" process
    @Column(name = "truck_id")
    private Integer truckId;

    @Column(name = "request_id")
    private Long requestId;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Column(name = "detail_")
    private String detail ;
    // Getters and setters
    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

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

    public Integer getDestinationX() {
        return destinationX;
    }

    public void setDestinationX(Integer destinationX) {
        this.destinationX = destinationX;
    }

    public Integer getDestinationY() {
        return destinationY;
    }

    public void setDestinationY(Integer destinationY) {
        this.destinationY = destinationY;
    }

    public String getUpsId() {
        return upsId;
    }

    public void setUpsId(String upsId) {
        this.upsId = upsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequstId(Long requestId) {
        this.requestId = requestId;
    }

}
