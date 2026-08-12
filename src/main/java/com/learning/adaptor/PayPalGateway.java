package com.learning.adaptor;

public class PayPalGateway {
    public void sendPayment(int amount) {
        System.out.println("Sending $" + amount/10 + " via PayPal.");
    }
}
