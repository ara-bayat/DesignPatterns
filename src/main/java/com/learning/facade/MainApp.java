package com.learning.facade;

public class MainApp {
    public static void main(String[] args) {
        // ایجاد زیرسیستم‌ها
        BluRayPlayer bluRay = new BluRayPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();
        Screen screen = new Screen();

        // ایجاد Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(bluRay, projector, sound, lights, screen);

        // تماشای فیلم با یک خط کد!
        homeTheater.watchMovie("Inception");

        // پایان فیلم با یک خط کد!
        homeTheater.endMovie();
    }
}
