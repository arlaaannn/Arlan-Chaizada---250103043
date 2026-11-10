package com.ecommerce;

// Subsystem 4: sends a receipt to the customer
public class NotificationService {

    public void sendReceipt(String customerId, double amount) {
        System.out.println("[Notification] Receipt for $" + amount + " sent to " + customerId);
    }
}
