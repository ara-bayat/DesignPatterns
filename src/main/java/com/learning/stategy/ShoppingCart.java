package com.learning.stategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(Item item) {
        items.add(item);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public int calculateTotal() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    public void checkout() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("روش پرداخت انتخاب نشده است!");
        }
        int total = calculateTotal();
        System.out.println("🛒 مجموع سبد خرید: " + total + " تومان");
        paymentStrategy.pay(total);
    }
}
