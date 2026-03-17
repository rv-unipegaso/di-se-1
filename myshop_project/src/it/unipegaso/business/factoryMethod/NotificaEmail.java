package it.unipegaso.business.factoryMethod;

public class NotificaEmail extends Notifica {

    @Override
    public void inviaNotifica() {
        System.out.println("Invio una email a "+getDestinatario().getNome());
        System.out.println(getMessaggio());

        //codice per collegarmi al server di posta in uscita
    }
}
