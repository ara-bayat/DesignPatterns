package com.learning.stategy;

public class MainApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("کتاب", 50000));
        cart.addItem(new Item("خودکار", 10000));

        // پرداخت با کارت بانکی
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "علی رضایی"));
        cart.checkout();

        System.out.println("\n--- تغییر روش پرداخت ---\n");

        // پرداخت با پی‌پال
        cart.setPaymentStrategy(new PayPalPayment("ali@example.com"));
        cart.checkout();

        System.out.println("\n--- تغییر روش پرداخت ---\n");

        // پرداخت با رمزارز
        cart.setPaymentStrategy(new CryptoPayment("0xABC123..."));
        cart.checkout();
    }
}