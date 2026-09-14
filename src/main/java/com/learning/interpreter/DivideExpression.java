package com.learning.interpreter;

// عملگر تقسیم
public class DivideExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public DivideExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        int divisor = right.interpret();
        if (divisor == 0) {
            throw new ArithmeticException("تقسیم بر صفر مجاز نیست!");
        }
        return left.interpret() / divisor;
    }
}