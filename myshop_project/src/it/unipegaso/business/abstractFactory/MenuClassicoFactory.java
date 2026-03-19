package it.unipegaso.business.abstractFactory;

public class MenuClassicoFactory implements MenuFactory{

    @Override
    public IPanino creaPanino() {
        System.out.println("Creo panino classico");
        return new PaninoClassico();
    }

    @Override
    public IBevanda creaBevanda() {
        System.out.println("Creo una birra");
        return new Birra();
    }
}
