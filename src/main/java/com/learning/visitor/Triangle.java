package com.learning.visitor;

public class Triangle implements Shape {
    private final double base;
    private final double height;
    private final double sideA;
    private final double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }
    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() { return "مثلث"; }
}
