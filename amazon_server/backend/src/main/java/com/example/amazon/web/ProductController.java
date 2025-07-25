package com.example.amazon.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazon.entity.Product;
import com.example.amazon.repo.ProductRepository;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final ProductRepository repo;
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> list() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Product detail(@PathVariable Long id) {
        // find product by id, if not found, create a new one
        return repo.findById(id).orElseGet(() -> {
            Product p = new Product();
            p.setId(id);
            p.setDescription("This is a test product");
            p.setCount(0);
            return p;
        });
    }
}
