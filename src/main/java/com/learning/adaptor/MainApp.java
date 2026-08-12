package com.learning.adaptor;

public class MainApp {
    public static void main(String[] args) {
        // 1. استفاده از زرین‌پال از طریق آداپتور
        PaymentProcessor processor1 = new ZarinpalAdapter(new ZarinpalGateway());
        processor1.pay(100000);  // ۱۰۰ هزار تومان

        // 2. استفاده از پی‌پی‌ال از طریق آداپتور
        PaymentProcessor processor2 = new PayPalAdapter(new PayPalGateway());
        processor2.pay(50000);   // ۵۰ هزار تومان (که به ۵۰۰۰ دلار تبدیل می‌شود)
    }
}
