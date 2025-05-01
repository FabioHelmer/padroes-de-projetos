package org.fh;

import org.fh.factorys.EmailNotificationFactory;
import org.fh.factorys.NotificationFactory;
import org.fh.factorys.PushNotificationFactory;
import org.fh.factorys.SmsNotificationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.sendNotification();

        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.sendNotification();

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.sendNotification();
    }
}