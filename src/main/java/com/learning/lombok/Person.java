package com.learning.lombok;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.ToString;

@Builder(builderMethodName = "hiddenBuilder", access = AccessLevel.PRIVATE)
@ToString
public class Person {
    private String firstName;  // اجباری
    private String lastName;   // اختیاری

    // متد استاتیک سفارشی برای فیلدهای اجباری
    public static PersonBuilder builder(String firstName) {
        return new PersonBuilder().firstName(firstName);
    }
}
