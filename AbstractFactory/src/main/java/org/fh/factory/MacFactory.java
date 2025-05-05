package org.fh.factory;

import org.fh.domain.MacButton;
import org.fh.domain.MacCheckbox;
import org.fh.interfaces.Button;
import org.fh.interfaces.Checkbox;
import org.fh.interfaces.GUIFactory;

public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
