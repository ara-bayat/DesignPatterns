package com.learning.visitor;

public class MainApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Circle(5));
        drawing.addShape(new Rectangle(4, 6));
        drawing.addShape(new Triangle(3, 4, 5, 5));

        System.out.println("=== محاسبه‌ی مساحت‌ها ===");
        AreaCalculator areaCalculator = new AreaCalculator();
        drawing.accept(areaCalculator);
        System.out.println("مجموع مساحت: " + String.format("%.2f", areaCalculator.getTotalArea()));

        System.out.println("\n=== محاسبه‌ی محیط‌ها ===");
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        drawing.accept(perimeterCalculator);
        System.out.println("مجموع محیط: " + String.format("%.2f", perimeterCalculator.getTotalPerimeter()));
    }
}
