package com.learning.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
    @Override
    public void check() {
        System.out.println("Mac Checkbox Checked!");
    }
}
