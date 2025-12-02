package it.unipegaso.view.decorator;

import javax.swing.*;
import java.util.List;

public class ClienteMenuDecorator extends MenuDecorator {

    public ClienteMenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    public List<JButton> getPulsanti() {
        pulsanti.addAll(this.menu.getPulsanti());

        JButton profilo = new JButton("Il mio profilo");
        pulsanti.add(profilo);

        return pulsanti;
    }
}
