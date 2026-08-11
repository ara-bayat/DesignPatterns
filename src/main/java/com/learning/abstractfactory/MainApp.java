package com.learning.abstractfactory;

public class MainApp {
    public static void main(String[] args) {
        // شبیه‌سازی تشخیص سیستم‌عامل (مثلاً از System.getProperty("os.name"))
        String osName = "Windows"; // این رو می‌تونی از محیط بگیرید

        GUIFactory factory;

        if (osName.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else if (osName.equalsIgnoreCase("Mac")) {
            factory = new MacFactory();
        } else {
            factory = new LinuxFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
        app.performActions();
    }
}
