package com.learning.flyweight;

public class MainApp {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // کاشتن ۱۰۰۰ درخت بلوط و کاج با موقعیت‌های متفاوت
        for (int i = 0; i < 500; i++) {
            forest.plantTree(i, i * 2, "Oak", "Green", "Rough");
        }

        for (int i = 0; i < 500; i++) {
            forest.plantTree(i + 1000, i * 3, "Pine", "Dark Green", "Smooth");
        }

        System.out.println("\n--- Drawing Forest ---");
        forest.draw();

        System.out.println("\n--- Results ---");
        System.out.println("Total trees planted: " + forest.getTreeCount());
        System.out.println("Total TreeType objects created: " + TreeFactory.getTreeTypeCount());
        System.out.println("Memory saved by sharing: " +
                (forest.getTreeCount() - TreeFactory.getTreeTypeCount()) + " objects!");
    }
}