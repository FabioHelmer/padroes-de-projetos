package org.fh;

import org.fh.domain.ConfiguracaoLinux;
import org.fh.domain.ConfiguracaoSistemaSingleton;
import org.fh.domain.ConfiguracaoWindows;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoSistemaSingleton.getInstancia().setLinguagem("Português");

        ConfiguracaoWindows windows = new ConfiguracaoWindows();
        ConfiguracaoLinux linux = new ConfiguracaoLinux();

        windows.render();
        linux.render();

    }
}