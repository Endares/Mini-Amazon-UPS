// src/main/java/com/example/amazon/repo/OrderRepository.java
package com.example.amazon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amazon.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
