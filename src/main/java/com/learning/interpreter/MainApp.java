package com.learning.interpreter;

public class MainApp {
    public static void main(String[] args) {
        // ساخت عبارت: (5 + 3) * 2
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression add = new AddExpression(five, three);        // 5 + 3 = 8
        Expression multiply = new MultiplyExpression(add, two); // 8 * 2 = 16

        System.out.println("(5 + 3) * 2 = " + multiply.interpret());

        // ساخت عبارت: 100 - 20 - 5
        Expression hundred = new NumberExpression(100);
        Expression twenty = new NumberExpression(20);
        Expression five2 = new NumberExpression(5);

        Expression subtract = new SubtractExpression(hundred, twenty); // 100 - 20 = 80
        Expression subtract2 = new SubtractExpression(subtract, five2); // 80 - 5 = 75

        System.out.println("100 - 20 - 5 = " + subtract2.interpret());

        // ساخت عبارت: (50 / 5) + (10 * 3)
        Expression fifty = new NumberExpression(50);
        Expression five3 = new NumberExpression(5);
        Expression ten = new NumberExpression(10);
        Expression three2 = new NumberExpression(3);

        Expression divide = new DivideExpression(fifty, five3);   // 50 / 5 = 10
        Expression multiply2 = new MultiplyExpression(ten, three2); // 10 * 3 = 30
        Expression add2 = new AddExpression(divide, multiply2);   // 10 + 30 = 40

        System.out.println("(50 / 5) + (10 * 3) = " + add2.interpret());
    }
}
