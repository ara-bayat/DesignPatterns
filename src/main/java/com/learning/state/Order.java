package com.learning.state;

public class Order {
    private OrderState currentState;
    private final String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
        this.currentState = new NewOrderState(); // وضعیت اولیه
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    // واگذاری درخواست‌ها به وضعیت فعلی
    public void pay() {
        currentState.pay(this);
    }

    public void ship() {
        currentState.ship(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void printStatus() {
        System.out.println("📦 سفارش " + orderId + " در وضعیت: " + currentState.getStateName());
    }
}
