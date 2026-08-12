package com.learning.decorator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {

    @Test
    public void testCoffeeWithMilkAndSugar_ShouldCalculateCorrectly() {
        // Arrange
        Beverage coffee = new Coffee();
        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        Beverage coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);

        // Act & Assert
        assertThat(coffeeWithMilkAndSugar.getCost()).isEqualTo(5.0 + 0.8 + 0.3);
        assertThat(coffeeWithMilkAndSugar.getDescription()).isEqualTo("Coffee + Milk + Sugar");
    }

    @Test
    public void testTeaWithWhippedCream_ShouldCalculateCorrectly() {
        // Arrange
        Beverage tea = new Tea();
        Beverage teaWithCream = new WhippedCreamDecorator(tea);

        // Act & Assert
        assertThat(teaWithCream.getCost()).isEqualTo(3.0 + 1.2);
        assertThat(teaWithCream.getDescription()).isEqualTo("Tea + Whipped Cream");
    }
}