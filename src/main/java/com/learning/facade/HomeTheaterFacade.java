package com.learning.facade;

public class HomeTheaterFacade {
    private BluRayPlayer bluRay;
    private Projector projector;
    private SoundSystem sound;
    private Lights lights;
    private Screen screen;

    public HomeTheaterFacade(BluRayPlayer bluRay, Projector projector,
                             SoundSystem sound, Lights lights, Screen screen) {
        this.bluRay = bluRay;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
        this.screen = screen;
    }

    // متد ساده برای تماشای فیلم
    public void watchMovie(String movie) {
        System.out.println("\n===== STARTING MOVIE =====");
        screen.down();
        lights.dim(20);
        projector.on();
        projector.wideScreenMode();
        sound.on();
        sound.setSurroundSound();
        sound.setVolume(15);
        bluRay.on();
        bluRay.play(movie);
        System.out.println("==========================\n");
    }

    // متد ساده برای پایان فیلم
    public void endMovie() {
        System.out.println("\n===== ENDING MOVIE =====");
        bluRay.stop();
        bluRay.off();
        sound.off();
        projector.off();
        lights.on();
        screen.up();
        System.out.println("========================\n");
    }
}