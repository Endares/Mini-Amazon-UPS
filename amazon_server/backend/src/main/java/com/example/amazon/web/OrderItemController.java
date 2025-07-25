package com.example.amazon.web;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazon.repo.OrderItemRepository;
import com.example.amazon.dataobject.OrderItemDTO;

@RestController
@RequestMapping("/api")
public class OrderItemController {
    private final OrderItemRepository items;

    public OrderItemController(OrderItemRepository items) {
        this.items = items;
    }

    @GetMapping("/orders/{orderId}/items")
    public List<OrderItemDTO> getItemsForOrder(@PathVariable Long orderId) {
        return items.findByOrderId(orderId).stream()
            .map(i -> new OrderItemDTO(i.getProductId(), i.getQuantity()))
            .collect(Collectors.toList());
    }
}
