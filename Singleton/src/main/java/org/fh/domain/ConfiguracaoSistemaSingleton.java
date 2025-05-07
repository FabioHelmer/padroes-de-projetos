package org.fh.domain;
public class ConfiguracaoSistemaSingleton {

    private static ConfiguracaoSistemaSingleton instancia;

    private String linguagem;

    private ConfiguracaoSistemaSingleton() {
        this.linguagem = "Português";
    }

    // Lazy initialization com sincronização para thread safety
    public static synchronized ConfiguracaoSistemaSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistemaSingleton();
        }
        return instancia;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}


