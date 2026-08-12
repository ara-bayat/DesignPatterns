package com.learning.lombok;

import java.util.ArrayList;

public class MainApi {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Ali")
                .hobby("Programming")   // یکی یکی اضافه می‌شوند
                .hobby("Reading")
                .hobby("Swimming")
                .build();
        User user2=user.toBuilder().hobby("sleeping").build();
        User user3=User.builder().name("tt").hobby("walking").build();
        System.out.println("user");
        System.out.println(user);
        System.out.println("user2");
        System.out.println(user2);
        System.out.println("user3");
        System.out.println(user3);

        Person person = Person.builder("alireza")  // firstName اجباری شد
                .build();
        System.out.println("person");
        System.out.println(person);

        Person person2 = person.toBuilder()  // firstName اجباری شد
                .lastName("ak")
                .build();
        System.out.println("person2");
        System.out.println(person2);

        System.out.println("---------------------------");

        User2 secondUser = User2.builder()
                .name("Ali")
                .hobbies(new ArrayList<>())
                .build();
        secondUser.getHobbies().add("Programming");
        secondUser.getHobbies().add("Reading");
        secondUser.getHobbies().add("Swimming");


        User2 secondUser2=secondUser.toBuilder().build();
        secondUser2.getHobbies().add("sleeping");


        User2 secondUser3 = secondUser.toBuilder()
                .hobbies(new ArrayList<>(secondUser.getHobbies())) // ← کپی عمیق
                .build();
        secondUser3.getHobbies().add("walking");

        System.out.println("secondUser");
        System.out.println(secondUser);
        System.out.println("secondUser2");
        System.out.println(secondUser2);


        System.out.println("secondUser3");
        System.out.println(secondUser3);




    }
}
