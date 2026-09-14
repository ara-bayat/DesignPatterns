package com.learning.stategy;

public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("🌐 پرداخت " + amount + " تومان با PayPal");
        System.out.println("   ایمیل: " + email);
    }
}
