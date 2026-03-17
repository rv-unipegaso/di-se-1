package it.unipegaso.business.factoryMethod;

public class NotificationFactory {

    public enum TIPO_NOTIFICA {SMS, EMAIL, PUSH}

    public Notifica creaNotifica(TIPO_NOTIFICA tipoNotifica) {
        Notifica n = null;

        switch(tipoNotifica) {
            case SMS:
                n = new NotificaSMS();
                break;
            case EMAIL:
                n = new NotificaEmail();
                break;
            case PUSH:
                n = new NotificaPush();
                break;
            default:
                n= new NotificaSMS();
        }

        return n;
    }

}
