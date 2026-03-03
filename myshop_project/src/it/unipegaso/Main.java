package it.unipegaso;

import it.unipegaso.dao.UtenteDAO;
import it.unipegaso.dbconnection.DbConnection;
import it.unipegaso.model.Utente;

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


    }

}
