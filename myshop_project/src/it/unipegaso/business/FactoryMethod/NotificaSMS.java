package it.unipegaso.business.FactoryMethod;

public class NotificaSMS extends Notifica {

    @Override
    public void inviaNotifica() {
        System.out.println("Invio un SMS a "+ getCliente().getCognome());
        System.out.println(getMsg());
    }
}
