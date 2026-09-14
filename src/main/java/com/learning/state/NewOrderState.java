package com.learning.state;

// وضعیت ۱: سفارش جدید
public class NewOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("✅ پرداخت با موفقیت انجام شد.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("❌ نمی‌توان سفارش پرداخت‌نشده را ارسال کرد!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("❌ نمی‌توان سفارش پرداخت‌نشده را تحویل داد!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("🚫 سفارش لغو شد.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getStateName() {
        return "جدید (New)";
    }
}