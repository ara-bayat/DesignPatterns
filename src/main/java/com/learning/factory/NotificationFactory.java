package com.learning.factory;

public abstract class NotificationFactory {
    // این همان Factory Method است
    public abstract Notification createNotification();

    // یک متد پیش‌فرض برای استفاده از Factory Method
    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
