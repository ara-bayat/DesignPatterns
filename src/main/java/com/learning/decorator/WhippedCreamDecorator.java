package com.learning.decorator;

import java.math.BigDecimal;

public class WhippedCreamDecorator extends BeverageDecorator {
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whipped Cream";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(BigDecimal.valueOf(1.2)); // هزینه‌ی خامه
    }
}
