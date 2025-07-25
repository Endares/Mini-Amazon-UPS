package com.example.amazon.client;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.amazon.entity.Product;
import com.example.amazon.repo.ProductRepository;
@Component
public class DataInitializer {

    private final ProductRepository productRepo;
    private final WorldClient worldClient;

    public DataInitializer(ProductRepository productRepo,
                           WorldClient worldClient) {
        this.productRepo  = productRepo;
        this.worldClient  = worldClient;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onReady() {
        if (productRepo.count() == 0) {
            Product w = productRepo.save(createProduct("测试用 Widget", 0));
            Product g = productRepo.save(createProduct("测试用 Gadget", 0));

            // send buy to world
            safeBuy(w);
            safeBuy(g);
        }
    }

    private void safeBuy(Product p) {
        try {
            worldClient.buy(1, p.getId(), p.getDescription(), p.getCount());
        } catch (Exception e) {
            System.err.println("world buy 初始化失败: " + e.getMessage());
        }
    }

    private static Product createProduct(String desc, int cnt) {
        Product p = new Product();
        p.setDescription(desc);
        p.setCount(cnt);
        return p;
    }
}