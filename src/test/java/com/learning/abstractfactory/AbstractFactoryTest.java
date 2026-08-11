package com.learning.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {

    @Test
    public void testWindowsFactory_ShouldCreateWindowsFamily() {
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertThat(button).isInstanceOf(WindowsButton.class);
        assertThat(checkbox).isInstanceOf(WindowsCheckbox.class);
    }

    @Test
    public void testMacFactory_ShouldCreateMacFamily() {
        GUIFactory factory = new MacFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertThat(button).isInstanceOf(MacButton.class);
        assertThat(checkbox).isInstanceOf(MacCheckbox.class);
    }

    @Test
    public void testLinuxFactory_ShouldCreateLinuxFamily() {
        GUIFactory factory = new LinuxFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertThat(button).isInstanceOf(LinuxButton.class);
        assertThat(checkbox).isInstanceOf(LinuxCheckbox.class);
    }
}
