package com.learning.adaptor;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal;

    public PayPalAdapter(PayPalGateway payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(int amount) {
        // تبدیل واحد پول (تومان به دلار) و تغییر نام متد
        int dollars = amount / 10;
        payPal.sendPayment(dollars);
    }
}
