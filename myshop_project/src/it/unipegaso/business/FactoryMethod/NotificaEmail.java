package it.unipegaso.business.FactoryMethod;

public class NotificaEmail extends Notifica {

    @Override
    public void inviaNotifica() {
        System.out.println("Mi collego al server di posta in uscita per inviare la mail al cliente "+ getCliente().getCognome());
        System.out.println(getMsg());
    }
}
