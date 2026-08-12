package com.learning.decorator;

import java.math.BigDecimal;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage; // ترکیب (Composition)

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription(); // به ارث می‌برند
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost(); // به ارث می‌برند
    }
}
