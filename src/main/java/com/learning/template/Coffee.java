package com.learning.template;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("☕ دم کردن قهوه...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("🥛 اضافه کردن شیر و شکر...");
    }

    // بازتعریف Hook: مشتری قهوه‌ی تلخ می‌خواهد
    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
