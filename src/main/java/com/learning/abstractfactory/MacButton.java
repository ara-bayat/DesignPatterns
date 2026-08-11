package com.learning.abstractfactory;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
    @Override
    public void onClick() {
        System.out.println("Mac Button Clicked!");
    }
}
