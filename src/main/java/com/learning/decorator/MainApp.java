package com.learning.decorator;

public class MainApp {
    public static void main(String[] args) {
        // 1. یک قهوه ساده
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // 2. قهوه با شیر و شکر
        Beverage coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new Coffee()));
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " -> $" + coffeeWithMilkAndSugar.getCost());

        // 3. چای با خامه و شکلات
        Beverage teaWithCreamAndChocolate = new ChocolateDecorator(new WhippedCreamDecorator(new Tea()));
        System.out.println(teaWithCreamAndChocolate.getDescription() + " -> $" + teaWithCreamAndChocolate.getCost());

        // 4. یک ترکیب عجیب: شیرکاکائو با خامه و شکر و شکلات
        Beverage crazyMix = new ChocolateDecorator(new SugarDecorator(new WhippedCreamDecorator(new HotChocolate())));
        System.out.println(crazyMix.getDescription() + " -> $" + crazyMix.getCost());
    }
}
