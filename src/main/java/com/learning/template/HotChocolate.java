package com.learning.template;

public class HotChocolate extends Beverage {
    @Override
    protected void brew() {
        System.out.println("🍫 حل کردن پودر کاکائو در شیر گرم...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("🍦 اضافه کردن خامه...");
    }
}
