package org.fh.domain;

import org.fh.interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação push...");
    }
}