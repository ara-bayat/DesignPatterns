package com.learning.flyweight;

public class TreeType {
    private final String name;    // حالت درونی
    private final String color;   // حالت درونی
    private final String texture; // حالت درونی

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    // متد رسم که حالت بیرونی (موقعیت) را به عنوان پارامتر می‌گیرد
    public void draw(int x, int y) {
        System.out.println("Drawing a " + name + " tree [Color: " + color +
                ", Texture: " + texture + "] at (" + x + ", " + y + ")");
    }

    public String getName() { return name; }
}