package com.learning.proxy;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("===== User with USER role =====");
        File file1 = new FileProxy("secret.txt", "USER");
        file1.read();   // لود میشود و خوانده می‌شود
        file1.write("Hello"); // خطا: دسترسی نداره
        file1.delete(); // خطا: دسترسی نداره

        System.out.println("\n===== Admin with ADMIN role =====");
        File file2 = new FileProxy("config.json", "ADMIN");
        file2.read();   // لود میشود و خوانده می‌شود
        file2.write("new settings"); // نوشته می‌شود
        file2.delete(); // حذف می‌شود

        System.out.println("\n===== Using Cache =====");
        File file3 = new FileProxy("secret.txt", "USER");
        file3.read();   // از کش خوانده می‌شود (بار دوم)
    }
}
