package it.unipegaso.view;

import it.unipegaso.view.actionlistener.LoginListener;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    private JTextField email;
    private JPasswordField password;

    public JTextField getEmail() {
        return email;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

    public LoginView() {
        super("Effettua il login");
        email = new JTextField(40);
        password = new JPasswordField(40);

        JLabel lblEmail = new JLabel("Email: ");
        JLabel lblPassword = new JLabel("Password: ");

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new LoginListener(this));

        add(lblEmail);
        add(email);
        add(lblPassword);
        add(password);
        add(btnLogin);

        setLayout(new GridLayout(3,2));

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
