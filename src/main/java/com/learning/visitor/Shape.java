package com.learning.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
    String getName();
}
