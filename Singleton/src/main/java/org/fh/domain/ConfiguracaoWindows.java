package org.fh.domain;

public class ConfiguracaoWindows {

    public void render(){
        ConfiguracaoSistemaSingleton config = ConfiguracaoSistemaSingleton.getInstancia();
        System.out.println("linguagem no Windows: "+config.getLinguagem());
    }

}
