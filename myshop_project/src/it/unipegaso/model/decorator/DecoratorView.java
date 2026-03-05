package it.unipegaso.model.decorator;

import javax.swing.*;
import java.awt.*;

public class DecoratorView extends JFrame {

    public DecoratorView() {
        super("Video demo del decorator");

        setLayout(new GridLayout(3,1));

        Menu guestMenu = new GuestMenu();
        Menu clienteMenu = new ClienteMenuDecorator(guestMenu);
        Menu managerMenu = new ManagerMenuDecorator(guestMenu);

        for(JButton btn : managerMenu.getPulsanti())
            add(btn);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
