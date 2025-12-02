package it.unipegaso.business.FactoryMethod;

public class NotificaPush extends Notifica {

    @Override
    public void inviaNotifica() {
        System.out.println("Mi collego ai server di Apple/Android per inviare la push notification a "+ getCliente().getCognome());
        System.out.println(getMsg());
    }
}
