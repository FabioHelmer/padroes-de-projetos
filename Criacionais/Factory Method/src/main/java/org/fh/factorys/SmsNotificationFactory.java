package org.fh.factorys;

import org.fh.domain.SmsNotification;
import org.fh.interfaces.Notification;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}