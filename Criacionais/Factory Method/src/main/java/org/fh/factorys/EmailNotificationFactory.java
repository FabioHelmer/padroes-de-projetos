package org.fh.factorys;

import org.fh.domain.EmailNotification;
import org.fh.interfaces.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}