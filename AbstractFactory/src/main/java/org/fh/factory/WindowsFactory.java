package org.fh.factory;

import org.fh.domain.WindowsButton;
import org.fh.domain.WindowsCheckbox;
import org.fh.interfaces.Button;
import org.fh.interfaces.Checkbox;
import org.fh.interfaces.GUIFactory;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
