package it.unipegaso.model.decorator;

import javax.swing.*;
import java.util.List;

public class ManagerMenuDecorator extends MenuDecorator {

    public ManagerMenuDecorator(Menu menu) {
        this.menu = menu;
    }

    public List<JButton> getPulsanti() {
        pulsanti.addAll(this.menu.getPulsanti());
        JButton magazzino = new JButton("Gestisci magazzino");
        pulsanti.add(magazzino);

        return pulsanti;
    }
}
