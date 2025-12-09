package it.unipegaso.business.AbstractFactory;

public class MenuKidFactory implements AbstractFactory {

    @Override
    public IPanino creaPanino() {
        System.out.println("Creo panino small");
        return new PaninoSmall();
    }

    @Override
    public IBevanda creaBevanda() {
        System.out.println("Creo una bevanda analcoolica piena di zuccheri");
        return new CocaCola();
    }
}
