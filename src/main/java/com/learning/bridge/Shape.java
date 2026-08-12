package com.learning.bridge;

public abstract class Shape {
    protected Color color; // پل (Bridge) به پیاده‌سازی

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw(); // متد انتزاعی برای رسم
}
