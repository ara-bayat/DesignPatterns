package com.learning.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel {
    private final String name;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public YouTubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("✅ یک مشترک جدید اضافه شد. تعداد مشترکین: " + subscribers.size());
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("❌ یک مشترک حذف شد. تعداد مشترکین: " + subscribers.size());
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        System.out.println("\n📢 کانال \"" + name + "\" ویدیوی جدیدی منتشر کرد: " + videoTitle);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(name, videoTitle);
        }
    }

    // انتشار ویدیوی جدید
    public void uploadVideo(String videoTitle) {
        System.out.println("\n🎬 ویدیوی جدید در حال آپلود: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}