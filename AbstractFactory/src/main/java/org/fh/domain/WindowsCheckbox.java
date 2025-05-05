package org.fh.domain;

import org.fh.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Renderizando checkbox estilo Windows");
    }
}
