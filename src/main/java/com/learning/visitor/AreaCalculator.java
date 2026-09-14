package com.learning.visitor;

public class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("مساحت دایره: " + String.format("%.2f", area));
        totalArea += area;
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("مساحت مستطیل: " + String.format("%.2f", area));
        totalArea += area;
    }

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("مساحت مثلث: " + String.format("%.2f", area));
        totalArea += area;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
