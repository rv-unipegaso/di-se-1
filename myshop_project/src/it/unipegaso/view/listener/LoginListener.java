package it.unipegaso.view.listener;

import com.mysql.cj.log.Log;
import it.unipegaso.business.ClienteBusiness;
import it.unipegaso.view.LoginView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private LoginView loginView;

    public LoginListener(LoginView loginView) {
        this.loginView=loginView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mail, pwd;

        mail = loginView.getTxt1().getText();
        pwd = new String(loginView.getPwd().getPassword());

        System.out.println("mail = "+mail);
        System.out.println("pwd = "+pwd);

        ClienteBusiness clienteBusiness = ClienteBusiness.getInstance();
        clienteBusiness.login(mail, pwd);
    }
}
