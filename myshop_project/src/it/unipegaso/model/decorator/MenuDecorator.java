package it.unipegaso.model.decorator;

import javax.swing.*;
import java.util.List;

public class MenuDecorator extends Menu {

    protected Menu menu;

    public List<JButton> getPulsanti() {
        return this.menu.getPulsanti();
    }
}
