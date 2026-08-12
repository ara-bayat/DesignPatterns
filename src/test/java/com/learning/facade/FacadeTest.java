package com.learning.facade;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FacadeTest {

    @Test
    public void testFacade_ShouldStartMovieCorrectly() {
        // Arrange
        BluRayPlayer bluRay = new BluRayPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();
        Screen screen = new Screen();

        HomeTheaterFacade facade = new HomeTheaterFacade(bluRay, projector, sound, lights, screen);

        // Act (فقط چک می‌کنیم که خطایی نده)
        facade.watchMovie("Test Movie");
        facade.endMovie();

        // Assert (در اینجا فقط مطمئن می‌شویم که متد بدون خطا اجرا شده)
        assertThat(true).isTrue();
    }
}
