package com.learning.template;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== درست کردن چای ===");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n=== درست کردن قهوه ===");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n=== درست کردن شکلات داغ ===");
        Beverage hotChocolate = new HotChocolate();
        hotChocolate.prepareRecipe();
    }
}
