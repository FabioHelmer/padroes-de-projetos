package org.fh.adapters;

import org.fh.interfaces.Tomada2Pinos;
import org.fh.interfaces.Tomada3Pinos;

// Adaptador que transforma Tomada2Pinos em Tomada3Pinos
public class AdaptadorTomada extends Tomada2Pinos implements Tomada3Pinos {
    @Override
    public void conectar() {
        // Chama o método da classe antiga
        ligar();
    }
}
