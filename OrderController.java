package com.ecommerce;

// Client: works only with the facade, not with the subsystems
public class OrderController {

    public static void main(String[] args) {
        CheckoutFacade facade = new CheckoutFacade();

        // successful order
        printResult(facade.placeOrder("Laptop-X1", "user_404", "123 Main St", 1200.00));

        // product is out of stock
        printResult(facade.placeOrder("Phone-A5", "user_405", "45 Abay Ave", 500.00));
    }

    private static void printResult(boolean success) {
        System.out.println(success ? "Result: order completed\n" : "Result: order failed\n");
    }
}
