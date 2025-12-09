package it.unipegaso;

import it.unipegaso.DAO.ProdottoDAO;
import it.unipegaso.business.AbstractFactory.AbstractFactory;
import it.unipegaso.business.AbstractFactory.FactoryProvider;
import it.unipegaso.business.AbstractFactory.IBevanda;
import it.unipegaso.business.AbstractFactory.IPanino;
import it.unipegaso.business.Bridge.Documento;
import it.unipegaso.business.Bridge.Fattura;
import it.unipegaso.business.Bridge.PdfBox20API;
import it.unipegaso.business.ClienteBusiness;
import it.unipegaso.business.FactoryMethod.Notifica;
import it.unipegaso.business.FactoryMethod.NotificationFactory;
import it.unipegaso.business.observer.Cameriere;
import it.unipegaso.business.observer.Cucina;
import it.unipegaso.business.observer.Ordine;
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
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

    public static void main(String args[]) {

        //codice di esempio per creare pdf
        /*
        try(PDDocument doc = new PDDocument()) {

            PDPage page = new PDPage();
            doc.addPage(page);

            try(PDPageContentStream contents = new PDPageContentStream(doc, page)) {
                contents.beginText();
                contents.setFont(PDType1Font.HELVETICA, 16);
                contents.newLineAtOffset(100, 700);
                contents.showText("Ciao a tutti!");
                contents.endText();
            }

            File tempFile = File.createTempFile("myshop_", ".pdf");
            System.out.println(tempFile);

            doc.save(tempFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //versione con l'API (bridge)
        Documento doc = new Fattura(new PdfBox20API());
        doc.salvaDocumento("Tutto il testo che vogliamo");

        //abstract factory
        FactoryProvider.FactoryType type = FactoryProvider.FactoryType.MENU_CLASSICO;
        AbstractFactory abstractFactory = FactoryProvider.getFactory(type);
        IPanino panino = abstractFactory.creaPanino();
        IBevanda bevanda = abstractFactory.creaBevanda();

        //factory method
        Cliente c = new Cliente();
        c.setCognome("Vergallo");
        c.setCanalePreferito(NotificationFactory.TIPO_NOTIFICA.EMAIL);
        NotificationFactory factory = new NotificationFactory();
        Notifica n = factory.creaNotifica(c.getCanalePreferito());
        n.setMsg("Messaggio di test");
        n.setCliente(c);
        n.inviaNotifica();


        //observer
        Ordine o = new Ordine();
        Cameriere cl = new Cameriere();
        cl.prendeOrdine(o);
        o.subscribe(cl);

        Cucina.getInstance().preparaOrdine();
        Cucina.getInstance().chiudiOrdine();


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
