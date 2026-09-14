package com.learning.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    // کش برای نگهداری نمونه‌های مشترک
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;

        // اگر نوع درخت قبلاً ساخته شده، همان را برگردان
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println(">>> Creating new TreeType: " + key);
        } else {
            System.out.println(">>> Reusing existing TreeType: " + key);
        }

        return treeTypes.get(key);
    }

    public static int getTreeTypeCount() {
        return treeTypes.size();
    }
}