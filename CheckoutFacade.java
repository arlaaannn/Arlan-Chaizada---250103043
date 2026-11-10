package com.ecommerce;

/**
 * Facade: hides 4 subsystems behind one method placeOrder().
 * The client does not need to know in what order the services are called.
 */
public class CheckoutFacade {

    private final InventoryService inventory = new InventoryService();
    private final PaymentGateway payment = new PaymentGateway();
    private final ShippingService shipping = new ShippingService();
    private final NotificationService notification = new NotificationService();

    public boolean placeOrder(String productId, String customerId, String address, double amount) {
        System.out.println("--- Checkout started ---");

        // 1. is the product available?
        if (!inventory.checkStock(productId)) {
            System.out.println("Order cancelled: out of stock");
            return false;
        }

        // 2. pay first, reserve only after successful payment
        if (!payment.charge(customerId, amount)) {
            System.out.println("Order cancelled: payment failed");
            return false;
        }
        inventory.reserve(productId);

        // 3. delivery and receipt
        shipping.scheduleDelivery(productId, address);
        notification.sendReceipt(customerId, amount);

        System.out.println("--- Checkout finished ---");
        return true;
    }
}
