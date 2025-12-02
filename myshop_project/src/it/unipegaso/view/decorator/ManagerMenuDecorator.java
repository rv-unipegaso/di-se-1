package it.unipegaso.view.decorator;

import javax.swing.*;
import java.util.List;

public class ManagerMenuDecorator extends MenuDecorator {

    public ManagerMenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    public List<JButton> getPulsanti() {
        pulsanti.addAll(this.menu.getPulsanti());

        JButton profilo = new JButton("Gestisci magazzino");
        pulsanti.add(profilo);

        return pulsanti;
    }
}
