package com.learning.abstractfactory;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Linux Checkbox");
    }
    @Override
    public void check() {
        System.out.println("Linux Checkbox Checked!");
    }
}
