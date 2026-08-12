package com.learning.prototype;

import java.util.List;

public class MonsterPrototypes {
    // نمونه‌های اولیه از پیش ساخته شده
    public static final Monster ORC = new Monster("Orc", 50, List.of("Axe", "Shield"));
    public static final Monster TROLL = new Monster("Troll", 80, List.of("Club", "Rock"));
    public static final Monster DRAGON = new Monster("Dragon", 200, List.of("Fire Breath", "Claws"));
}
