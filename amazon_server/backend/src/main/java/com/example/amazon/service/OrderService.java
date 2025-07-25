// src/main/java/com/example/amazon/service/OrderService.java
package com.example.amazon.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service; // Ensure this is the correct package for AResponses
import org.springframework.transaction.annotation.Transactional;

import com.example.amazon.client.UpsClient;
import com.example.amazon.client.WorldClient;
import com.example.amazon.entity.Order;
import com.example.amazon.entity.OrderItem;
import com.example.amazon.entity.Product;
import com.example.amazon.enums.OrderStatus;
import com.example.amazon.exceptions.NotInStockException;
import com.example.amazon.repo.OrderRepository;
import com.example.amazon.repo.ProductRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepo;
    private final WorldClient worldClient;
    private final UpsClient upsClient;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepo, 
                        WorldClient worldClient, 
                        ProductRepository productRepository,
                        UpsClient upsClient) {
        this.upsClient = upsClient;
        this.orderRepo = orderRepo;
        this.worldClient = worldClient;
        this.productRepository = productRepository;
    }

    @Transactional
    public Long createOrder(int destX, int destY, List<OrderItem> items) throws Exception {
        // 1. create order
        Order order = saveOrder(destX, destY, items);

        // 2. 检查库存
        try {
            checkAndReserveStock(items);
        } catch (NotInStockException e) {
            // not in stock, cancel order
            order.setStatus(OrderStatus.CANCELLED);
            orderRepo.save(order);
            return -1L;
        }
        
            
        // 3. 下单
        long shipmentId = placeOrder(items, order);
        order.setShipmentId(shipmentId);
        order.setStatus(OrderStatus.ORDERED);
        orderRepo.save(order);

        // 4. 异步处理发货
        doFulfillmentAsync(order.getId(), 0, 0);
        return order.getId();
    }

    @Async
    public void doFulfillmentAsync(Long orderId, int destX, int destY) throws Exception {
        int  whId        = 1;           // 你的仓库 id（写死 1）
        long shipmentId  = orderId;     // 约定：shipmentId == orderId

        worldClient.packAsync(whId, shipmentId)                // pack
        .thenApply(r -> {                                      // ready
            setStatus(orderId, OrderStatus.PACKED);
            return r;
        })
        .thenCompose(r ->
            upsClient.bookTruckAsync(shipmentId, whId, 0, 0, destX, destY))   // book
        .thenApply(ack -> {
            setStatus(orderId, OrderStatus.WAITING_TRUCK);
            System.out.printf("[Service] Shipment %d BOOKED TRUCK%n", shipmentId);
            return ack;
        })
        .thenCompose(ack ->                                      // 等卡车到
            upsClient.waitTruckArrivedAsync(shipmentId))
        .thenCompose(arr -> {                          // ④ load
            setStatus(orderId, OrderStatus.LOADING);
            System.out.printf("[order sever] load shipment %d onto truck %d%n", shipmentId, arr.getTruckid());
            return worldClient.loadAsync(whId, shipmentId, arr.getTruckid());
        })
        .thenCompose(r ->                             // ⑤ startDeliver
            upsClient.startDeliverAsync(shipmentId)
                    .thenApply(ack -> {              // 收到 UPS 对 startDeliver 的 ACK
                        setStatus(orderId, OrderStatus.SHIPPED);
                        System.out.printf("[Service] Shipment %d START_DELIVER%n", shipmentId);
                        return ack;                  // 把该 Future 传下去
                    })
                    
        )
        .thenCompose(ack ->                           // ⑥ wait delivered
            upsClient.waitDeliveredAsync(shipmentId))
        .thenAccept(d -> setStatus(orderId, OrderStatus.DELIVERED))
        .whenComplete((v, ex) -> {
          if (ex != null) {
              System.err.printf("[Service] Shipment %d FAILED: %s%n",
                                shipmentId, ex.getMessage());
              setStatus(orderId, OrderStatus.CANCELLED);
          } else {
              System.out.printf("[Service] Shipment %d flow complete%n", shipmentId);
          }
        });
    }
    
    private void setStatus(Long id, OrderStatus st) {
        Order o = orderRepo.findById(id).orElseThrow();
        o.setStatus(st);
        orderRepo.save(o);
    }
    /**
     * Create an order and save it to the database.
     * @param destX the destination X coordinate
     * @param destY the destination Y coordinate
     * @param items the list of order items
     * @return the saved order
     */
    private Order saveOrder(int destX, int destY, List<OrderItem> items) {
        final Order order = new Order();
        order.setDestX(destX);
        order.setDestY(destY);
        order.setStatus(OrderStatus.CREATED);
        order.setCreatedAt(LocalDateTime.now());
        items.forEach(i -> i.setOrder(order));
        order.setItems(items);
        orderRepo.save(order);
        return orderRepo.save(order);
    }

    /**
     * Check and reserve stock for the order items.
     * 
     * @param items the list of order items
     * @throws IllegalArgumentException if a product is not found
     */
    private void checkAndReserveStock(List<OrderItem> items) {
        for (OrderItem item : items) {
            checkStock(item);
            reserveStock(item);
        }
    }

    /**
     * Check if the product is in stock
     * if not in stock, throw NotInStockException
     * 
     * return if in stock
     * @param item the order item
     * @throws NotInStockException if the product is not in stock
     */
    private void checkStock(OrderItem item) throws NotInStockException {
        // find the product by id, if not found, create a new product
        Product product = findOrCreateProduct(item, "This is a test product");
        // check if the product is in stock
        if (product.getCount() < item.getQuantity()) {
            // not in stock, throw NotInStockException
            throw new NotInStockException("Product is not in stock");
        }
    }

    /**
     * Reserve stock for the order item.
     * @param item the order item
     */
    private void reserveStock(OrderItem item) {
        // find the product by id, if not found, create a new product
        Product product = findOrCreateProduct(item, "This is a test product");
        // reserve the stock
        product.setCount(product.getCount() - item.getQuantity());
        productRepository.save(product);
    }

    /**
     * 
     */
    private long placeOrder(List<OrderItem> items, Order order) throws Exception {
        OrderItem it = items.get(0);
        Product product = findOrCreateProduct(it, "This is a test product");
        long shipId = order.getId();
        return shipId;
    }

    /**
     * Find or create a product by its ID.
     * @param productId the product ID
     * @return the found or created product
     */
    private Product findOrCreateProduct(OrderItem item, String description) {
        return productRepository.findById(item.getProductId())
            .orElseGet(() -> {
                Product p = new Product();
                p.setDescription(description);
                p.setCount(0);
                return productRepository.save(p);
            });
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepo.findById(id);
    }


}
