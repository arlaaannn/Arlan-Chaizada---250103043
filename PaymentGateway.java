package com.ecommerce;

// Subsystem 2: charges the customer
public class PaymentGateway {

    public boolean charge(String customerId, double amount) {
        System.out.println("[Payment] Charging $" + amount + " from " + customerId);

        // simple check instead of a real bank
        if (amount <= 0) {
            System.out.println("[Payment] Wrong amount, payment declined");
            return false;
        }

        System.out.println("[Payment] Payment successful");
        return true;
    }
}
