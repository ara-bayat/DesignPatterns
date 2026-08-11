package com.learning.builder;

public class User {
    // فیلدهای نهایی (final) برای Immutability
    private final String firstName; // اجباری
    private final String lastName;  // اجباری
    private final int age;          // اختیاری
    private final String phone;     // اختیاری
    private final String address;   // اختیاری
    private final String email;     // اختیاری

    // سازنده‌ی خصوصی که Builder را دریافت می‌کند
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
    }

    // Getterها (فقط خواندنی)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }

    // ================ Builder داخلی ================
    public static class UserBuilder {
        // فیلدهای اجباری
        private final String firstName;
        private final String lastName;

        // فیلدهای اختیاری با مقدار پیش‌فرض
        private int age = 0;
        private String phone = "";
        private String address = "";
        private String email = "";

        // سازنده‌ی Builder برای فیلدهای اجباری
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // متدهای تنظیم فیلدهای اختیاری (هر کدوم یک Builder برمی‌گردانند)
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        // متد build برای ساخت نهایی User
        public User build() {
            return new User(this);
        }
    }

    // ================ Override toString برای نمایش راحت ================
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
