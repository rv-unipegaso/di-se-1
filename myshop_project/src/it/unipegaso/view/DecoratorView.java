package it.unipegaso.view;

import it.unipegaso.view.decorator.ClienteMenuDecorator;
import it.unipegaso.view.decorator.GuestMenu;
import it.unipegaso.view.decorator.ManagerMenuDecorator;
import it.unipegaso.view.decorator.Menu;
import it.unipegaso.view.listener.LoginListener;

import javax.swing.*;
import java.awt.*;

public class DecoratorView extends JFrame {


    public DecoratorView() {
        super("View demo del Decorator");


        setLayout(new GridLayout(2,1));


        Menu guestMenu = new GuestMenu();
        Menu clienteMenu = new ClienteMenuDecorator(guestMenu);
        Menu managerMenu = new ManagerMenuDecorator(guestMenu); //ManagerMenu extends Guestmenu
        for(JButton btn : managerMenu.getPulsanti())
            add(btn);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
