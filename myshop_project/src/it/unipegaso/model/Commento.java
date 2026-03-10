package it.unipegaso.model;

import java.util.Date;

public class Commento {

    public enum Punteggio { SCARSO, MEDIOCRE, BUONO, ECCELLENTE}

    private int id;
    private String testo;
    private Date data;
    private Punteggio punteggio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Punteggio getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(Punteggio punteggio) {
        this.punteggio = punteggio;
    }
}
