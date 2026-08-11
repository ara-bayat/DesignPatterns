package com.learning.builder;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTest {

    @Test
    public void testBuilder_ShouldCreateUserWithAllFields() {
        // وقتی
        User user = new User.UserBuilder("Ali", "Rezaei")
                .age(30)
                .phone("09123456789")
                .address("Tehran")
                .email("ali@example.com")
                .build();

        // آنگاه
        assertThat(user.getFirstName()).isEqualTo("Ali");
        assertThat(user.getLastName()).isEqualTo("Rezaei");
        assertThat(user.getAge()).isEqualTo(30);
        assertThat(user.getPhone()).isEqualTo("09123456789");
        assertThat(user.getAddress()).isEqualTo("Tehran");
        assertThat(user.getEmail()).isEqualTo("ali@example.com");
    }

    @Test
    public void testBuilder_ShouldCreateUserWithOnlyMandatoryFields() {
        // وقتی
        User user = new User.UserBuilder("Sara", "Ahmadi").build();

        // آنگاه
        assertThat(user.getFirstName()).isEqualTo("Sara");
        assertThat(user.getLastName()).isEqualTo("Ahmadi");
        assertThat(user.getAge()).isEqualTo(0);
        assertThat(user.getPhone()).isEqualTo("");
        assertThat(user.getAddress()).isEqualTo("");
        assertThat(user.getEmail()).isEqualTo("");
    }

    @Test
    public void testBuilder_ShouldCreateUserWithSomeOptionalFields() {
        // وقتی
        User user = new User.UserBuilder("Reza", "Karimi")
                .age(25)
                .phone("09219876543")
                .build();

        // آنگاه
        assertThat(user.getFirstName()).isEqualTo("Reza");
        assertThat(user.getLastName()).isEqualTo("Karimi");
        assertThat(user.getAge()).isEqualTo(25);
        assertThat(user.getPhone()).isEqualTo("09219876543");
        assertThat(user.getAddress()).isEqualTo("");
        assertThat(user.getEmail()).isEqualTo("");
    }
}
