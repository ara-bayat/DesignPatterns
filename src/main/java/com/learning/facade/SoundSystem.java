package com.learning.facade;

public class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON.");
    }
    public void off() {
        System.out.println("Sound System is OFF.");
    }
    public void setSurroundSound() {
        System.out.println("Sound System set to SURROUND mode.");
    }
    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }
}
