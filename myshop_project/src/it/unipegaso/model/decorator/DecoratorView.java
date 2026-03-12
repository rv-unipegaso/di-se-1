package it.unipegaso.model.decorator;

import javax.swing.*;
import java.awt.*;

public class DecoratorView extends JFrame {

    public DecoratorView() {
        super("Video demo del decorator");

        setLayout(new GridLayout(3,1));

        Menu guestMenu = new GuestMenu();
        Menu managerMenu = new ManagerMenuDecorator(guestMenu);
        Menu clienteMenu = new ClienteMenuDecorator(managerMenu);

        for(JButton btn : clienteMenu.getPulsanti())
            add(btn);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
