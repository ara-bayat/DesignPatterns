package com.learning.stategy;

public class CryptoPayment implements PaymentStrategy {
    private final String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("₿ پرداخت " + amount + " تومان با رمزارز");
        System.out.println("   آدرس کیف پول: " + walletAddress);
    }
}