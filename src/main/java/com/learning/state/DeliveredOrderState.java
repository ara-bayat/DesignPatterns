package com.learning.state;

// وضعیت ۴: تحویل‌شده
public class DeliveredOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("⚠️ سفارش قبلاً پرداخت و تحویل شده است!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("⚠️ سفارش قبلاً ارسال شده است!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("⚠️ سفارش قبلاً تحویل داده شده است!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("❌ سفارش تحویل‌شده قابل لغو نیست!");
    }

    @Override
    public String getStateName() {
        return "تحویل‌شده (Delivered)";
    }
}
