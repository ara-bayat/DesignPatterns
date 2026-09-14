package com.learning.chainofresponsibility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler; // ارجاع به هندلر بعدی

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(SupportRequest request);

    // متد کمکی برای پاس دادن درخواست به هندلر بعدی
    protected void passToNext(SupportRequest request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("❌ هیچ هندلری برای این درخواست وجود ندارد: " + request.getIssue());
        }
    }
}