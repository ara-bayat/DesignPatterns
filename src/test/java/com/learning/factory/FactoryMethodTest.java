package com.learning.factory;

import com.learning.factory.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    public void testEmailFactory_ShouldReturnEmailNotification() {
        NotificationFactory factory = new EmailNotificationFactory();
        Notification notification = factory.createNotification();

        assertThat(notification).isInstanceOf(EmailNotification.class);
    }

    @Test
    public void testSMSFactory_ShouldReturnSMSNotification() {
        NotificationFactory factory = new SMSNotificationFactory();
        Notification notification = factory.createNotification();

        assertThat(notification).isInstanceOf(SMSNotification.class);
    }

    @Test
    public void testPushFactory_ShouldReturnPushNotification() {
        NotificationFactory factory = new PushNotificationFactory();
        Notification notification = factory.createNotification();

        assertThat(notification).isInstanceOf(PushNotification.class);
    }
}
