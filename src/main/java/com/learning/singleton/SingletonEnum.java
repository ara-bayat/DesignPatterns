package com.learning.singleton;

/**
 * بهترین روش پیاده‌سازی Singleton در جاوا با استفاده از Enum
 * (مقاوم در برابر Reflection و Serialization)
 */
public enum SingletonEnum {
    INSTANCE;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton! Name: " + name);
    }
}
