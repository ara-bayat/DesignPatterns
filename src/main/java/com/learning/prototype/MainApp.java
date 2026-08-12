package com.learning.prototype;

public class MainApp {
    public static void main(String[] args) {
        // 1. کپی کردن یک Orc (با همه‌ی ویژگی‌ها)
        Monster orcClone1 = MonsterPrototypes.ORC.clone();
        orcClone1.setName("Orc Warrior");

        Monster orcClone2 = MonsterPrototypes.ORC.clone();
        orcClone2.setName("Orc Shaman");
        orcClone2.getWeapons().add("Staff");  // تغییر در کپی، روی اصل اثر نمی‌گذارد

        // 2. کپی کردن یک Dragon
        Monster dragonClone = MonsterPrototypes.DRAGON.clone();
        dragonClone.setName("Ice Dragon");
        dragonClone.getWeapons().set(0, "Ice Breath");

        // 3. چاپ نمونه‌ها
        System.out.println("Original ORC: " + MonsterPrototypes.ORC);
        System.out.println("Clone 1: " + orcClone1);
        System.out.println("Clone 2: " + orcClone2);
        System.out.println("Original DRAGON: " + MonsterPrototypes.DRAGON);
        System.out.println("Clone DRAGON: " + dragonClone);
    }
}