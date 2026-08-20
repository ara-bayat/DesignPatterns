package com.learning.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User ali = new User("Ali", chatRoom);
        User sara = new User("Sara", chatRoom);
        User reza = new User("Reza", chatRoom);

        chatRoom.addUser(ali);
        chatRoom.addUser(sara);
        chatRoom.addUser(reza);

        ali.send("سلام به همه!");
        sara.send("سلام علی، خوبی؟");
        reza.send("درود بر همگی");
    }
}
