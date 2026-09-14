package com.learning.stategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String holderName;

    public CreditCardPayment(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("💳 پرداخت " + amount + " تومان با کارت بانکی");
        System.out.println("   شماره کارت: " + maskCardNumber(cardNumber));
        System.out.println("   صاحب کارت: " + holderName);
    }

    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() < 4) return "****";
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}
