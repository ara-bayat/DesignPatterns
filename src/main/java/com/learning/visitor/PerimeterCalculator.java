package com.learning.visitor;

public class PerimeterCalculator implements ShapeVisitor {
    private double totalPerimeter = 0;

    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("محیط دایره: " + String.format("%.2f", perimeter));
        totalPerimeter += perimeter;
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("محیط مستطیل: " + String.format("%.2f", perimeter));
        totalPerimeter += perimeter;
    }

    @Override
    public void visit(Triangle triangle) {
        double perimeter = triangle.getBase() + triangle.getSideA() + triangle.getSideB();
        System.out.println("محیط مثلث: " + String.format("%.2f", perimeter));
        totalPerimeter += perimeter;
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }
}
