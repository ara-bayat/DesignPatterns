package com.learning.observer;

public class SMSSubscriber implements Subscriber {
    private final String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("📱 پیامک به " + phoneNumber + ": ویدیوی جدید \"" + videoTitle +
                "\" از کانال " + channelName + " منتشر شد!");
    }
}

