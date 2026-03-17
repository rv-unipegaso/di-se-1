package it.unipegaso.business.factoryMethod;

import it.unipegaso.model.Utente;

public abstract class Notifica {

    private String messaggio;
    private Utente destinatario;

    public abstract void inviaNotifica();

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public Utente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Utente destinatario) {
        this.destinatario = destinatario;
    }
}
