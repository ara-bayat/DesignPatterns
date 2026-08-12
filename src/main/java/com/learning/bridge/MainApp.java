package com.learning.bridge;

public class MainApp {
    public static void main(String[] args) {
        // یک دایره‌ی قرمز
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        // یک مربع آبی
        Shape blueSquare = new Square(new BlueColor());
        blueSquare.draw();

        // یک مثلث سبز
        Shape greenTriangle = new Triangle(new GreenColor());
        greenTriangle.draw();

        // یک دایره‌ی سبز (ترکیب جدید بدون نیاز به کلاس جدید!)
        Shape greenCircle = new Circle(new GreenColor());
        greenCircle.draw();
    }
}
