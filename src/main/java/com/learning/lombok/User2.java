package com.learning.lombok;

import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@ToString
@Getter
@Setter
public class User2 {

    @NonNull
    private String name;
    private List<String> hobbies;
}
