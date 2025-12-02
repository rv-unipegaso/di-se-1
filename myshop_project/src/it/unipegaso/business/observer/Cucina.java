package it.unipegaso.business.observer;

public class Cucina {

    private static Cucina instance;
    private Ordine ordineInPreparazione;

    public static synchronized Cucina getInstance() {
        if(instance == null)
            instance = new Cucina();
        return instance;
    }

    private Cucina() {

    }

    public void riceviOrdine(Ordine ordine) {
        this.ordineInPreparazione = ordine;
        ordineInPreparazione.setStatoOrdine(Ordine.STATO_ORDINE.RICEVUTO);
    }

    public void preparaOrdine() {
        ordineInPreparazione.setStatoOrdine(Ordine.STATO_ORDINE.IN_PREPARAZIONE);
    }

    public void chiudiOrdine() {
        ordineInPreparazione.setStatoOrdine(Ordine.STATO_ORDINE.PRONTO);
    }



}
