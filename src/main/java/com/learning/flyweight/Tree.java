package com.learning.flyweight;

public class Tree {
    private final int x;        // حالت بیرونی
    private final int y;        // حالت بیرونی
    private final TreeType type; // ارجاع به Flyweight

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}