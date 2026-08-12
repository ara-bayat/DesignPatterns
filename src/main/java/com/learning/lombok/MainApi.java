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
    }
}
