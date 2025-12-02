package it.unipegaso.business.FactoryMethod;

public class NotificationFactory {

    public enum TIPO_NOTIFICA { SMS, EMAIL, PUSH};

    public Notifica creaNotifica(TIPO_NOTIFICA tipoNotifica) {

        Notifica n = null;

        if(tipoNotifica == null)
            n = new NotificaEmail();

        else {
            switch(tipoNotifica) {
                case EMAIL: n = new NotificaEmail(); break;
                case SMS: n = new NotificaSMS(); break;
                case PUSH: n = new NotificaPush();
            }
        }

        return n;
    }
}
