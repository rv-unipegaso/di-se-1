package it.unipegaso.business.AbstractFactory;

public class MenuClassicoFactory implements AbstractFactory {

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
