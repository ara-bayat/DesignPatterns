package com.learning.chainofresponsibility;

// هندلر سطح ۲: درخواست‌های متوسط
public class Level2Support extends SupportHandler {
    @Override
    public void handle(SupportRequest request) {
        if (request.getSeverity() == 2) {
            System.out.println("✅ سطح ۲ درخواست را حل کرد: " + request.getIssue());
        } else {
            System.out.println("⏩ سطح ۲ نمی‌تواند حل کند، به مدیر پاس می‌دهد...");
            passToNext(request);
        }
    }
}

