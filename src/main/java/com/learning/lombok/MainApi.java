package com.learning.lombok;

public class MainApi {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Ali")
                .hobby("Programming")   // یکی یکی اضافه می‌شوند
                .hobby("Reading")
                .hobby("Swimming")
                .build();
        User user2=user.toBuilder().hobby("sleeping").build();
        System.out.println("user");
        System.out.println(user);
        System.out.println("user2");
        System.out.println(user2);
    }
}
