package it.unipegaso.view.decorator;

import javax.swing.*;

public class GuestMenu extends Menu {

    public GuestMenu() {
        JButton sfoglia = new JButton("Sfoglia catalogo");
        //sfoglia.addActionListener(...);
        pulsanti.add(sfoglia);
    }
}
