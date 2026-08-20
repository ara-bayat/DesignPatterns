package com.learning.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // پیام به همه کاربران به جز فرستنده ارسال می‌شود
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
