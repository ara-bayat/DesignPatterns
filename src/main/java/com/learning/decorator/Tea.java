package com.learning.decorator;

import java.math.BigDecimal;

public class Tea implements Beverage {
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(3.0);
    }
}
