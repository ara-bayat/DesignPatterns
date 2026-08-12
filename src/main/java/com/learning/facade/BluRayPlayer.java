package com.learning.facade;

public class BluRayPlayer {
    public void on() {
        System.out.println("Blu-ray Player is ON.");
    }
    public void off() {
        System.out.println("Blu-ray Player is OFF.");
    }
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
    public void stop() {
        System.out.println("Stopped playing.");
    }
}