package com.learning.chainofresponsibility;

// هندلر سطح ۱: درخواست‌های ساده
public class Level1Support extends SupportHandler {
    @Override
    public void handle(SupportRequest request) {
        if (request.getSeverity() == 1) {
            System.out.println("✅ سطح ۱ درخواست را حل کرد: " + request.getIssue());
        } else {
            System.out.println("⏩ سطح ۱ نمی‌تواند حل کند، به سطح ۲ پاس می‌دهد...");
            passToNext(request);
        }
    }
}

