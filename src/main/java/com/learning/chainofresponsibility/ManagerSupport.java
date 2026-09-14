package com.learning.chainofresponsibility;

// هندلر مدیر: درخواست‌های بحرانی
public class ManagerSupport extends SupportHandler {
    @Override
    public void handle(SupportRequest request) {
        if (request.getSeverity() == 3) {
            System.out.println("✅ مدیر درخواست را حل کرد: " + request.getIssue());
        } else {
            System.out.println("❌ حتی مدیر هم نتوانست این درخواست را حل کند!");
            passToNext(request);
        }
    }
}
