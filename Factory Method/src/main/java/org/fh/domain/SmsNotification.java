package org.fh.domain;

import org.fh.interfaces.Notification;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação por SMS...");
    }
}
