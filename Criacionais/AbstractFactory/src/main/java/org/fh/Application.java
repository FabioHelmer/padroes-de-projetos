package org.fh;

import org.fh.interfaces.Button;
import org.fh.interfaces.Checkbox;
import org.fh.interfaces.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}
