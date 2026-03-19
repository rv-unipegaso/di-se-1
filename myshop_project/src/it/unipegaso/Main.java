package it.unipegaso;

import it.unipegaso.business.UtenteBusiness;
import it.unipegaso.business.abstractFactory.IBevanda;
import it.unipegaso.business.abstractFactory.IPanino;
import it.unipegaso.business.abstractFactory.MenuFactory;
import it.unipegaso.business.abstractFactory.MenuFactoryProvider;
import it.unipegaso.business.bridge.Documento;
import it.unipegaso.business.bridge.Fattura;
import it.unipegaso.business.bridge.PdfBox2035API;
import it.unipegaso.business.factoryMethod.Notifica;
import it.unipegaso.business.factoryMethod.NotificationFactory;
import it.unipegaso.business.observer.Cameriere;
import it.unipegaso.business.observer.Cucina;
import it.unipegaso.business.observer.Ordine;
import it.unipegaso.business.strategy.CommentiMiglioriStrategy;
import it.unipegaso.business.strategy.IOrdinamentoCommentiStrategy;
import it.unipegaso.business.strategy.OrdinamentoCommenti;
import it.unipegaso.dao.UtenteDAO;
import it.unipegaso.dbconnection.DbConnection;
import it.unipegaso.model.Commento;
import it.unipegaso.model.Utente;
import it.unipegaso.model.decorator.DecoratorView;
import it.unipegaso.model.decorator.Menu;
import it.unipegaso.view.LoginView;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            UtenteBusiness singolaIstanza = UtenteBusiness.getInstance();
            singolaIstanza.login(email, password);
        }

        DecoratorView decoratorView = new DecoratorView();

        //esempio dello strategy
        List<Commento> commenti = new ArrayList<Commento>();
        Commento c1 = new Commento();
        Commento c2 = new Commento();
        c1.setPunteggio(Commento.Punteggio.SCARSO);
        c2.setPunteggio(Commento.Punteggio.ECCELLENTE);
        commenti.add(c1);
        commenti.add(c2);
        IOrdinamentoCommentiStrategy ordinamentoCommentiStrategy = new CommentiMiglioriStrategy();
        OrdinamentoCommenti ordinamentoCommenti = new OrdinamentoCommenti();
        ordinamentoCommenti.setCommenti(commenti);
        ordinamentoCommenti.setOrdinamentoCommentiStrategy(ordinamentoCommentiStrategy);
        ordinamentoCommenti.ordina();

        //Menu m = new Menu();

        //test design pattern observer
        Ordine ordine = new Ordine();
        Cameriere cameriere = new Cameriere();
        ordine.subscribe(cameriere);

        Cucina.getInstance().riceviOrdine(ordine); //in realtà si dovrebbe passare dalla classe Cameriere...

        Cucina.getInstance().preparaOrdine();
        Cucina.getInstance().chiudiOrdine();

        //test del factory method
        Utente utente = new Utente();
        utente.setNome("Roberto");
        utente.setCognome("Vergallo");
        //settare tutte le variabili che servono alle classi concrete per funzionare (es. indirizzo email ecc)

        NotificationFactory factory = new NotificationFactory();
        Notifica n = factory.creaNotifica(NotificationFactory.TIPO_NOTIFICA.SMS); //la preferenza andrebbe presa ad esempio da un campo del database
        n.setDestinatario(utente);
        n.setMessaggio("Questo è un messaggio di prova");
        n.inviaNotifica();

        //test dell'abstract factory
        MenuFactoryProvider.FactoryType type = MenuFactoryProvider.FactoryType.MENU_KIDS; // arriva dall'ordine fatto dal cliente
        MenuFactory menuFactory = MenuFactoryProvider.getFactory(type);
        IPanino panino = menuFactory.creaPanino();
        IBevanda bevanda = menuFactory.creaBevanda();

        //test del bridge
        Documento doc = new Fattura(new PdfBox2035API());
        doc.salvaDocumento("Riepilogo del tuo ordine");
    }

}
