package com.learning.lombok;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder(toBuilder = true)
@ToString
public class User {

    @NonNull
    private String name;
    @Singular
    private List<String> hobbies;
}
