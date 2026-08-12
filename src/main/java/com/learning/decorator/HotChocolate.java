package com.learning.decorator;

import java.math.BigDecimal;

public class HotChocolate implements Beverage {
    @Override
    public String getDescription() {
        return "Hot Chocolate";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(4.5);
    }
}
