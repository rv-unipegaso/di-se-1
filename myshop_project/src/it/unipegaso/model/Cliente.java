package it.unipegaso.model;

import it.unipegaso.business.FactoryMethod.NotificationFactory;

public class Cliente {

    private int id;
    private String nome;
    private String cognome;
    private String mail;
    private NotificationFactory.TIPO_NOTIFICA canalePreferito;

    public NotificationFactory.TIPO_NOTIFICA getCanalePreferito() {
        return canalePreferito;
    }

    public void setCanalePreferito(NotificationFactory.TIPO_NOTIFICA canalePreferito) {
        this.canalePreferito = canalePreferito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
