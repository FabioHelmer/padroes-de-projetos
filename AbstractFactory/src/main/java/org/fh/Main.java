package org.fh;

import org.fh.factory.MacFactory;
import org.fh.factory.WindowsFactory;
import org.fh.interfaces.GUIFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
