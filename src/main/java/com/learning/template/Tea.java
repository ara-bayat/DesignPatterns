package com.learning.template;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("🍵 دم کردن چای...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("🍋 اضافه کردن لیمو...");
    }
}


