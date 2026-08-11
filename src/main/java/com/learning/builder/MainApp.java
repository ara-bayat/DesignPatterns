package com.learning.builder;

public class MainApp {
    public static void main(String[] args) {
        // کاربر با تمام فیلدها
        User user1 = new User.UserBuilder("Ali", "Rezaei")
                .age(30)
                .phone("09123456789")
                .address("Tehran, Iran")
                .email("ali@example.com")
                .build();

        // کاربر فقط با فیلدهای اجباری
        User user2 = new User.UserBuilder("Sara", "Ahmadi")
                .build();

        // کاربر با چند فیلد اختیاری
        User user3 = new User.UserBuilder("Reza", "Karimi")
                .age(25)
                .phone("09219876543")
                .build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
