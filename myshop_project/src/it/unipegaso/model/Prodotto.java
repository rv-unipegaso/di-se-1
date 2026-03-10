package it.unipegaso.model;

import java.util.List;

public class Prodotto {

    private int idprodotto;
    private String nome;
    private Float prezzo;
    private List<Commento> commenti;

    public int getIdprodotto() {
        return idprodotto;
    }

    public void setIdprodotto(int idprodotto) {
        this.idprodotto = idprodotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }
}
