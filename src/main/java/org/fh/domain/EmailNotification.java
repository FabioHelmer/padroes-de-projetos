package org.fh.domain;

import org.fh.interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Enviando notificação por e-mail...");
    }
}