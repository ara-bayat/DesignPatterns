package com.learning.observer;

public class EmailSubscriber implements Subscriber {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("📧 ایمیل به " + email + ": ویدیوی جدید \"" + videoTitle +
                "\" از کانال " + channelName + " منتشر شد!");
    }
}

