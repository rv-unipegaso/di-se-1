package it.unipegaso;

import it.unipegaso.DAO.ProdottoDAO;
import it.unipegaso.business.ClienteBusiness;
import it.unipegaso.business.strategy.CommentiMiglioriStrategy;
import it.unipegaso.business.strategy.CommentiPiuRecentiStrategy;
import it.unipegaso.business.strategy.IOrdinamentoCommentiStrategy;
import it.unipegaso.business.strategy.OrdinamentoCommenti;
import it.unipegaso.dbconnection.DbConnection;
import it.unipegaso.dbconnection.command.DbOperationExecutor;
import it.unipegaso.model.Cliente;
import it.unipegaso.model.Commento;
import it.unipegaso.model.Prodotto;
import it.unipegaso.view.DecoratorView;
import it.unipegaso.view.LoginView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

    public static void main(String args[]) {
        System.out.println("Hello world!");

        DecoratorView decoratorView = new DecoratorView();

        ClienteBusiness clienteBusiness = ClienteBusiness.getInstance();
        //ClienteBusiness clienteBusiness2 = new ClienteBusiness();

        //strategy
        OrdinamentoCommenti ordinamentoCommenti = new OrdinamentoCommenti(new ArrayList<Commento>());
        IOrdinamentoCommentiStrategy ordinamentoCommentiStrategy = new CommentiPiuRecentiStrategy();
        ordinamentoCommenti.setOrdinamentoCommentiStrategy(ordinamentoCommentiStrategy);
        ordinamentoCommenti.ordina();


        if(args!=null && args.length>0) {
            //voglio usare la view da riga di comando
            ClienteBusiness.getInstance().login(args[0], args[1]);
        } else {
            LoginView loginView = new LoginView();
        }

        /*
        DbConnection dbConnection = DbConnection.getInstance();
        int res= dbConnection.executeUpdate("INSERT INTO prodotto VALUES(null,'panino',5)");
        System.out.println("numero di righe inserite: "+res);

        dbConnection.executeUpdate("INSERT INTO cliente VALUES(null,'Roberto','Vergallo','roberto.vergallo@unipegaso.it')");

        dbConnection.executeUpdate("INSERT INTO acquista VALUES(1,1,2)");

        ProdottoDAO pDao = new ProdottoDAO();
        ArrayList<Prodotto> listaProdotti = pDao.findAll();

        Iterator<Prodotto> i = listaProdotti.iterator();
        while(i.hasNext()) {
            Prodotto p = i.next();
            System.out.println(p.getNome());
        }*/


    }
}
