package com.learning.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
    @Override
    public void check() {
        System.out.println("Windows Checkbox Checked!");
    }
}
