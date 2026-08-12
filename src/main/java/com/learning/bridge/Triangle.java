package com.learning.bridge;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Triangle filled with ");
        color.applyColor();
        System.out.println();
    }
}
