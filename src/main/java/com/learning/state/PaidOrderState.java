package com.learning.state;

// وضعیت ۲: پرداخت‌شده
public class PaidOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("⚠️ این سفارش قبلاً پرداخت شده است!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("🚚 سفارش ارسال شد.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("❌ نمی‌توان سفارش ارسال‌نشده را تحویل داد!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("🚫 سفارش پرداخت‌شده لغو شد. مبلغ بازگردانده می‌شود.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getStateName() {
        return "پرداخت‌شده (Paid)";
    }
}