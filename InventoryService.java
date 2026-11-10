package com.ecommerce;

import java.util.HashMap;
import java.util.Map;

// Subsystem 1: keeps track of products in the warehouse
public class InventoryService {

    private final Map<String, Integer> stock = new HashMap<>();

    public InventoryService() {
        // some test products
        stock.put("Laptop-X1", 3);
        stock.put("Phone-A5", 0);
    }

    public boolean checkStock(String productId) {
        int count = stock.getOrDefault(productId, 0);
        System.out.println("[Inventory] " + productId + " in stock: " + count);
        return count > 0;
    }

    public void reserve(String productId) {
        stock.put(productId, stock.get(productId) - 1);
        System.out.println("[Inventory] 1 item reserved, left: " + stock.get(productId));
    }
}
