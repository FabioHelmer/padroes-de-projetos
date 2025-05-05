package org.fh.domain;

import org.fh.interfaces.Checkbox;

public class MacCheckbox implements Checkbox {
    public void render() {
        System.out.println("Renderizando checkbox estilo Mac");
    }
}
