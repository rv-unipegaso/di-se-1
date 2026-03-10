package it.unipegaso.view.actionlistener;

import it.unipegaso.business.UtenteBusiness;
import it.unipegaso.view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private LoginView loginView;

    private static UtenteBusiness instance;

    public LoginListener(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Email: " + loginView.getEmail().getText());
        System.out.println("Password: " + new String(loginView.getPassword().getPassword()));

        UtenteBusiness utenteBusiness = UtenteBusiness.getInstance();
        boolean loginOk = utenteBusiness.login(loginView.getEmail().getText(), new String(loginView.getPassword().getPassword()));

        if(loginOk) {
            System.out.println("Benvenuto");
        }
        else {
            System.out.println("Login errato");
        }

    }
}
