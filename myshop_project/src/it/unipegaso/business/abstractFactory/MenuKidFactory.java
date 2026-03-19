package it.unipegaso.business.abstractFactory;

public class MenuKidFactory implements MenuFactory{

    @Override
    public IPanino creaPanino() {
        System.out.println("Creo panino small");
        return new PaninoSmall();
    }

    @Override
    public IBevanda creaBevanda() {
        System.out.println("Creo una Coca-Cola");
        return new CocaCola();
    }
}
