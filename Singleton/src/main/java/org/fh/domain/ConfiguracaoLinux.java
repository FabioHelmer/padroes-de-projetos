package org.fh.domain;

public class ConfiguracaoLinux {

    public void render(){
        ConfiguracaoSistemaSingleton config = ConfiguracaoSistemaSingleton.getInstancia();
        System.out.println("linguagem no Linux: "+config.getLinguagem());
    }

}
