package com.learning.observer;

public class MainApp {
    public static void main(String[] args) {
        // ساخت کانال
        YouTubeChannel techChannel = new YouTubeChannel("Tech with Ali");

        // ساخت مشترکین
        Subscriber emailSub = new EmailSubscriber("ali@example.com");
        Subscriber smsSub = new SMSSubscriber("09123456789");
        Subscriber pushSub = new PushNotificationSubscriber("device-12345");

        // اشتراک
        techChannel.subscribe(emailSub);
        techChannel.subscribe(smsSub);
        techChannel.subscribe(pushSub);

        // انتشار ویدیو
        techChannel.uploadVideo("آموزش Redis از صفر");

        // لغو اشتراک یکی از مشترکین
        techChannel.unsubscribe(smsSub);

        // انتشار ویدیوی دوم
        techChannel.uploadVideo("آموزش Kafka برای مبتدیان");
    }
}
