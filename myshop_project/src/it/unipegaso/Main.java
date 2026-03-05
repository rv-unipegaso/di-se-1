package it.unipegaso;

import it.unipegaso.business.UtenteBusiness;
import it.unipegaso.dao.UtenteDAO;
import it.unipegaso.dbconnection.DbConnection;
import it.unipegaso.model.Utente;
import it.unipegaso.model.decorator.DecoratorView;
import it.unipegaso.view.LoginView;

import java.sql.ResultSet;

public class Main {

    public static void main(String args[]) {
        System.out.println("Hello world!");

        /* DI 2
        if(args!=null && args.length>1) {
            System.out.println("Primo parametro = "+args[0]);
            System.out.println("Secondo parametro = "+args[1]);

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            MathUtil mathUtil = new MathUtil(a, b);
            mathUtil.somma();

            MathUtil mathUtil2 = new MathUtil();
        }
        */

        UtenteDAO uDao = new UtenteDAO();
        Utente u = uDao.findById(1);
        if(u!=null)
            System.out.println("Ciao "+u.getNome());

        // lezione su architettura standalone
        LoginView loginView = new LoginView();

        if(args!=null && args.length>1) {
            String email = args[0];
            String password = args[1];
            UtenteBusiness utenteBusiness = new UtenteBusiness();
            utenteBusiness.login(email, password);
        }

        DecoratorView decoratorView = new DecoratorView();

    }

}
