
// src/main/java/com/example/amazon/repo/OrderItemRepository.java
package com.example.amazon.repo;
import java.util.List; 

import com.example.amazon.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Spring Data will implement this for you
    List<OrderItem> findByOrderId(Long orderId);
}
