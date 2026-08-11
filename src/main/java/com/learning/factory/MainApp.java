package com.learning.factory;

public class MainApp {
    public static void main(String[] args) {
        // کاربر انتخاب کرده که اعلان ایمیل بگیرد
        NotificationFactory factory = new EmailNotificationFactory();
        factory.notifyUser("Hello via Email!");

        // کاربر انتخاب کرده که اعلان پیامک بگیرد
        factory = new SMSNotificationFactory();
        factory.notifyUser("Hello via SMS!");

        // کاربر انتخاب کرده که پوش بگیرد
        factory = new PushNotificationFactory();
        factory.notifyUser("Hello via Push!");
    }
}
