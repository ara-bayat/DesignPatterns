package com.learning.singleton;


public class SingletonDoubleCheckedLocking {

    // 1. استفاده از volatile برای جلوگیری از visibility issues در محیط چندنخی
    private static volatile SingletonDoubleCheckedLocking instance;

    // 2. پرایوت کردن سازنده برای جلوگیری از new کردن خارج از کلاس
    private SingletonDoubleCheckedLocking() {
        // جلوگیری از ساخت نمونه از طریق Reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    // 3. متد عمومی برای دسترسی به نمونه
    public static SingletonDoubleCheckedLocking getInstance() {
        // بررسی اولیه (بدون قفل) - برای بالا بردن سرعت
        if (instance == null) {
            // قفل گرفتن روی کلاس برای همگام‌سازی
            synchronized (SingletonDoubleCheckedLocking.class) {
                // بررسی دوم (با قفل) - فقط یک بار اجرا میشه
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    // ============ متدهای معمولی کلاس ============
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton (Double-Checked Locking)! Name: " + name);
    }
}
