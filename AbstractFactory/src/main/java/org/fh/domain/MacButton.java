package org.fh.domain;

import org.fh.interfaces.Button;

public class MacButton implements Button {
    public void render() {
        System.out.println("Renderizando botão estilo Mac");
    }
}
