package it.unipegaso.business.factoryMethod;

public class NotificaPush extends Notifica {

    @Override
    public void inviaNotifica() {
        System.out.println("Invio una notifica push a "+getDestinatario().getNome());
        System.out.println(getMessaggio());

        //codice per collegarmi ai server di Apple/Google
    }
}
