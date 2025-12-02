package it.unipegaso.view;

import it.unipegaso.view.listener.LoginListener;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {


    private JTextField txt1 = new JTextField(40);
    private JPasswordField pwd = new JPasswordField(40);

    public JTextField getTxt1() {
        return txt1;
    }

    public JPasswordField getPwd() {
        return pwd;
    }

    public LoginView() {
        super("Effettua il login");

        JLabel lbl1 = new JLabel("email:");
        JLabel lbl2 = new JLabel("password:");


        JButton btn1 = new JButton("Login!");
        LoginListener loginListener = new LoginListener(this);
        btn1.addActionListener(loginListener);

        setLayout(new GridLayout(3,2));

        add(lbl1);
        add(txt1);
        add(lbl2);
        add(pwd);
        add(btn1);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
