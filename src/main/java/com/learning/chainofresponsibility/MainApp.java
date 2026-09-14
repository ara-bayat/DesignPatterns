package com.learning.chainofresponsibility;

public class MainApp {
    public static void main(String[] args) {
        // ساخت زنجیره‌ی مسئولیت
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler manager = new ManagerSupport();

        level1.setNextHandler(level2);
        level2.setNextHandler(manager);

        // تست درخواست‌های مختلف
        System.out.println("--- درخواست ساده ---");
        level1.handle(new SupportRequest("سوال در مورد رمز عبور", 1));

        System.out.println("\n--- درخواست متوسط ---");
        level1.handle(new SupportRequest("مشکل در نصب نرم‌افزار", 2));

        System.out.println("\n--- درخواست بحرانی ---");
        level1.handle(new SupportRequest("شکایت از کیفیت خدمات", 3));
    }
}