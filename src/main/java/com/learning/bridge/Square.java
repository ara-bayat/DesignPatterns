package com.learning.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Square filled with ");
        color.applyColor();
        System.out.println();
    }
}
