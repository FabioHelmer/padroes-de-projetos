package org.fh.factorys;

import org.fh.domain.PushNotification;
import org.fh.interfaces.Notification;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}