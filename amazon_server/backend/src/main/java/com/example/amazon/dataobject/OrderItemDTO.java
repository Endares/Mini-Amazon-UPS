package com.example.amazon.dataobject;
import java.util.List;

public class OrderItemDTO {
    private long productId;
    private int quantity;

    public OrderItemDTO() {}
    public OrderItemDTO(long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
    public long getProductId()    { return productId; }
    public void setProductId(long p) { this.productId = p; }
    public int getQuantity()      { return quantity; }
    public void setQuantity(int q)   { this.quantity = q; }
}
