package com.learning.decorator;

import java.math.BigDecimal;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(5.0); // قیمت پایه
    }
}
