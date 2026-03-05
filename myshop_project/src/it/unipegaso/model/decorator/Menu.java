package it.unipegaso.model.decorator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

    protected List<JButton> pulsanti = new ArrayList<JButton>();

    public List<JButton> getPulsanti() {
        return pulsanti;
    }
}
