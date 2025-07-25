// src/main/java/com/example/amazon/web/OrderController.java
package com.example.amazon.web;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazon.entity.OrderItem;
import com.example.amazon.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService svc;
    public OrderController(OrderService svc) { this.svc = svc; }

    @PostMapping("/orders")
    public Map<String,Object> create(@RequestBody Map<String,Object> body) throws Exception {
        int destX = (int) body.get("destX");
        int destY = (int) body.get("destY");
        List<Map<String,Object>> itemsJson = (List<Map<String,Object>>) body.get("items");

        List<OrderItem> items = itemsJson.stream().map(m -> {
            OrderItem it = new OrderItem();
            it.setProductId(((Number)m.get("productId")).longValue());
            it.setQuantity((int)m.get("quantity"));
            return it;
        }).collect(Collectors.toList());

        Long orderId = svc.createOrder(destX, destY, items);
        return Map.of("orderId", orderId);
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<Map<String, Object>> get(@PathVariable Long id) {
        // Fetch from DB (assuming orderRepo exists)
        var order = svc.getOrderById(id)
                    .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Order not found"));

        Map<String, Object> body = new HashMap<>();
        body.put("orderId", order.getId());
        body.put("status",  order.getStatus().toString());
        body.put("destX",   order.getDestX());
        body.put("destY",   order.getDestY());
        body.put("trackingNumber", order.getShipmentId());

        return ResponseEntity.ok(body);
    }

    @GetMapping("/orders")
    public List<Map<String,Object>> getAllOrders() {
        List<Map<String,Object>> result = new ArrayList<>();
        svc.getAllOrders().forEach(order -> {
            Map<String,Object> m = new HashMap<>();
            m.put("orderId", order.getId());
            m.put("status", order.getStatus().toString());
            m.put("trackingNumber", order.getShipmentId());
            result.add(m);
        });
        return result;
    }
}
