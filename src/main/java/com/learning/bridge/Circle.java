package com.learning.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Circle filled with ");
        color.applyColor();
        System.out.println();
    }
}
