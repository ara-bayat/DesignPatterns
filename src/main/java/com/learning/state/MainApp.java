package com.learning.state;

public class MainApp {
    public static void main(String[] args) {
        Order order = new Order("ORD-1001");
        order.printStatus();

        System.out.println("\n--- پرداخت ---");
        order.pay();
        order.printStatus();

        System.out.println("\n--- ارسال ---");
        order.ship();
        order.printStatus();

        System.out.println("\n--- تحویل ---");
        order.deliver();
        order.printStatus();

        System.out.println("\n--- تلاش برای لغو سفارش تحویل‌شده ---");
        order.cancel();

        System.out.println("\n--- یک سفارش دیگر که لغو می‌شود ---");
        Order order2 = new Order("ORD-1002");
        order2.cancel();
        order2.printStatus();
    }
}
