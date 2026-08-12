package com.learning.prototype;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Cloneable {
    private String name;
    private int power;
    private List<String> weapons; // یک شیء mutable (تغییرپذیر)

    public Monster(String name, int power, List<String> weapons) {
        this.name = name;
        this.power = power;
        this.weapons = weapons != null ? new ArrayList<>(weapons) : new ArrayList<>();
    }

    // Getter و Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }
    public List<String> getWeapons() { return weapons; }
    public void setWeapons(List<String> weapons) { this.weapons = new ArrayList<>(weapons); }

    // ====== متد clone (کپی عمیق) ======
    @Override
    public Monster clone() {
        try {
            // 1. کپی سطحی (shallow) با super.clone()
            Monster cloned = (Monster) super.clone();
            // 2. کپی عمیق (deep) برای فیلدهای mutable
            cloned.weapons = new ArrayList<>(this.weapons);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed!", e);
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', power=" + power + ", weapons=" + weapons + "}";
    }
}
