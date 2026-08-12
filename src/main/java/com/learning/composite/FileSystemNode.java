package com.learning.composite;

public interface FileSystemNode {
    String getName();
    int getSize();  // حجم بر حسب کیلوبایت
    void display(); // نمایش ساختار درختی
}