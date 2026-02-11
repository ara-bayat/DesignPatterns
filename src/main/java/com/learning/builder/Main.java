package com.learning.builder;

public class Main {

    public static void main(String[] args) {
        House house=House.builder()
                .roof("flatRoof")
                .walls("small wall")
                .windows("windows xp")
                .build();
    }
}
