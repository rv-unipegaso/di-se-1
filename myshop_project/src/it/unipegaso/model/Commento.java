package it.unipegaso.model;

import java.util.Date;

public class Commento {

    public enum Punteggio { SCARSO, MEDIOCRE, BUONO, ECCELLENTE}

    private int id;
    private String testo;
    private Punteggio punteggio;
    private Date data;

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

    public Punteggio getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(Punteggio punteggio) {
        this.punteggio = punteggio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
