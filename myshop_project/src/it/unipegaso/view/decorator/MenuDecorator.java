package it.unipegaso.view.decorator;

import javax.swing.*;
import java.util.List;

public abstract class MenuDecorator extends Menu{ //è un menu

    protected Menu menu; //ha un menu

    public List<JButton> getPulsanti() {
        return this.menu.getPulsanti();
    }
}
