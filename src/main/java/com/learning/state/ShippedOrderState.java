package com.learning.state;

// وضعیت ۳: ارسال‌شده
public class ShippedOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("⚠️ سفارش قبلاً پرداخت شده است!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("⚠️ سفارش قبلاً ارسال شده است!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("📬 سفارش تحویل داده شد.");
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("❌ سفارش ارسال‌شده قابل لغو نیست!");
    }

    @Override
    public String getStateName() {
        return "ارسال‌شده (Shipped)";
    }
}
