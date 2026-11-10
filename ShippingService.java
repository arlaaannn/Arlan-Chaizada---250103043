package com.ecommerce;

// Subsystem 3: delivery
public class ShippingService {

    public void scheduleDelivery(String productId, String address) {
        System.out.println("[Shipping] Checking address: " + address);
        System.out.println("[Shipping] " + productId + " will be delivered to " + address);
    }
}
