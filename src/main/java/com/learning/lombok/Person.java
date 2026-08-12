package com.learning.lombok;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "", toBuilder = true)
@ToString
public class Person {
    private final String firstName;  // اجباری
    private String lastName;   // اختیاری


    public static PersonBuilder builder(String firstName) {
        return new PersonBuilder().firstName(firstName);
    }
}
