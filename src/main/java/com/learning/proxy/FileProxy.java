package com.learning.proxy;

import java.util.HashSet;
import java.util.Set;

public class FileProxy implements File {
    private RealFile realFile;
    private String fileName;
    private String userRole; // نقش کاربر
    private static Set<String> cache = new HashSet<>(); // کش ساده

    public FileProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    // Lazy Loading: فقط زمانی که نیاز شد فایل رو لود کن
    private void ensureLoaded() {
        if (realFile == null) {
            realFile = new RealFile(fileName);
        }
    }

    @Override
    public void read() {
        // 1. کنترل دسترسی (Protection Proxy)
        if (!userRole.equals("ADMIN") && !userRole.equals("USER")) {
            System.out.println("Access Denied! You don't have permission to read this file.");
            return;
        }

        // 2. کش کردن (Cache Proxy)
        if (cache.contains(fileName + "_read")) {
            System.out.println("Reading from cache: " + fileName);
            return;
        }

        // 3. Lazy Loading (Virtual Proxy)
        ensureLoaded();
        realFile.read();
        cache.add(fileName + "_read");
    }

    @Override
    public void write(String data) {
        // فقط ADMIN اجازه نوشتن دارد
        if (!userRole.equals("ADMIN")) {
            System.out.println("Access Denied! Only ADMIN can write to this file.");
            return;
        }

        ensureLoaded();
        realFile.write(data);
        // بعد از نوشتن، کش را پاک می‌کنیم
        cache.remove(fileName + "_read");
    }

    @Override
    public void delete() {
        // فقط ADMIN اجازه حذف دارد
        if (!userRole.equals("ADMIN")) {
            System.out.println("Access Denied! Only ADMIN can delete this file.");
            return;
        }

        ensureLoaded();
        realFile.delete();
        cache.remove(fileName + "_read");
    }
}
