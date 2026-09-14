package com.learning.observer;

public class PushNotificationSubscriber implements Subscriber {
    private final String deviceId;

    public PushNotificationSubscriber(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("🔔 پوش نوتیفیکیشن به دستگاه " + deviceId + ": ویدیوی جدید \"" +
                videoTitle + "\" از کانال " + channelName + " منتشر شد!");
    }
}
