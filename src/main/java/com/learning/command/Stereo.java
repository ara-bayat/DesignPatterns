package com.learning.command;

public class Stereo {
    public void on() {
        System.out.println("🎵 سیستم صوتی روشن شد");
    }
    public void off() {
        System.out.println("🎵 سیستم صوتی خاموش شد");
    }
    public void setVolume(int level) {
        System.out.println("🎵 صدا روی " + level + " تنظیم شد");
    }
}
