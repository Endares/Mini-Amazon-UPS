package com.example.amazon.dispatch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.amazon.client.WorldClient;
import com.example.amazon.entity.Product;
import com.example.amazon.repo.ProductRepository;


@Component
public class InventoryRestocker {
    private static final int THRESHOLD = 10;    // 库存低于 10 就补
    private static final int RESTOCK_TO = 50;   // 补到 50 件
    private static final int RESTOCK_DELAY = 1000; // 每隔 1 分钟跑一次
    private final ProductRepository productRepo;
    private final WorldClient worldClient;

    public InventoryRestocker(ProductRepository productRepo,
                              WorldClient worldClient) {
        this.productRepo = productRepo;
        this.worldClient = worldClient;
    }

    @Scheduled(fixedDelay = RESTOCK_DELAY)
    public void autoRestock() {
        System.out.println("Running auto-restock...");
        for (Product p : productRepo.findAll()) {
            if (p.getCount() < THRESHOLD) {
                int need = RESTOCK_TO - p.getCount();
                try {
                    worldClient.buy(1, p.getId(), p.getDescription(), need);
                    // 真正到货后会走 RequestDispatcher.processArrived 更新本地库存
                    System.out.println("Auto-restock sent for product " 
                        + p.getId() + ": need=" + need);
                } catch (Exception e) {
                    System.err.println("Auto-restock failed for " 
                        + p.getId() + ": " + e.getMessage());
                }
            }
        }
    }
}