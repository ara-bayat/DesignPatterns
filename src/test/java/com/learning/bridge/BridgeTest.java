package com.learning.bridge;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BridgeTest {

    @Test
    public void testBridge_ShouldCombineShapeAndColorCorrectly() {
        // Arrange
        Shape circle = new Circle(new RedColor());
        Shape square = new Square(new BlueColor());

        // Act & Assert
        assertThat(circle).isInstanceOf(Circle.class);
        assertThat(square).isInstanceOf(Square.class);
        // بررسی اینکه رنگ‌ها به درستی تنظیم شده‌اند
        assertThat(circle.color).isInstanceOf(RedColor.class);
        assertThat(square.color).isInstanceOf(BlueColor.class);
    }
}
