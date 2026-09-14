package com.learning.state;

// وضعیت ۵: لغو‌شده
public class CancelledOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("❌ سفارش لغو‌شده قابل پرداخت نیست!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("❌ سفارش لغو‌شده قابل ارسال نیست!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("❌ سفارش لغو‌شده قابل تحویل نیست!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("⚠️ سفارش قبلاً لغو شده است!");
    }

    @Override
    public String getStateName() {
        return "لغو‌شده (Cancelled)";
    }
}
