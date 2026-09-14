package com.learning.template;

public abstract class Beverage {

    // ===== Template Method =====
    // این متد final است تا زیرکلاس‌ها نتوانند ساختار الگوریتم را تغییر دهند
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // ===== مراحل مشترک (پیاده‌سازی در کلاس پایه) =====
    private void boilWater() {
        System.out.println("💧 جوشاندن آب...");
    }

    private void pourInCup() {
        System.out.println("☕ ریختن در فنجان...");
    }

    // ===== مراحل متفاوت (Primitive Operations) =====
    protected abstract void brew();
    protected abstract void addCondiments();

    // ===== Hook (اختیاری) =====
    // پیاده‌سازی پیش‌فرض: مشتری افزودنی می‌خواهد
    protected boolean customerWantsCondiments() {
        return true;
    }
}