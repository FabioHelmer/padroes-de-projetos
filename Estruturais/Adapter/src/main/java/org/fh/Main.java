package org.fh;

import org.fh.adapters.AdaptadorTomada;
import org.fh.interfaces.Tomada3Pinos;

public class Main {

    public static void conectarDispositivo(Tomada3Pinos tomada) {
        tomada.conectar();
    }

    public static void main(String[] args) {
        Tomada3Pinos adaptador = new AdaptadorTomada();
        conectarDispositivo(adaptador); // Saída: Tomada de 2 pinos conectada.
    }

}