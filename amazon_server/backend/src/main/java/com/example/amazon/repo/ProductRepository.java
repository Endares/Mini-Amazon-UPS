package com.example.amazon.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amazon.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
