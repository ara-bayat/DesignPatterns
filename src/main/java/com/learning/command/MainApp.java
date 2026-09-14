package com.learning.command;

public class MainApp {
    public static void main(String[] args) {
        // ساخت گیرنده‌ها
        Light livingRoomLight = new Light();
        Stereo stereo = new Stereo();

        // ساخت فرمان‌ها
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command stereoOn = new StereoOnCommand(stereo);

        // ساخت Invoker
        RemoteControl remote = new RemoteControl(2);
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, stereoOn, new LightOffCommand(livingRoomLight)); // مثال

        // اجرای فرمان‌ها
        System.out.println("--- دکمه‌ی ۰ (روشن) ---");
        remote.pressOnButton(0);

        System.out.println("\n--- دکمه‌ی ۱ (سیستم صوتی) ---");
        remote.pressOnButton(1);

        System.out.println("\n--- دکمه‌ی Undo ---");
        remote.pressUndoButton();
    }
}
