package it.unipegaso.business.factoryMethod;

public class NotificaSMS extends Notifica {

    @Override
    public void inviaNotifica() {
        System.out.println("Invio un SMS a "+getDestinatario().getNome());
        System.out.println(getMessaggio());

        // codice per collegarmi al servizio di invio sms...
    }
}
