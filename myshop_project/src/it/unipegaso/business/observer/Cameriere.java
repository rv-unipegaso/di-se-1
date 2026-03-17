package it.unipegaso.business.observer;

public class Cameriere implements Observer{
    @Override
    public void notify(Object o) {

        Ordine.STATO_ORDINE statoOrdine = (Ordine.STATO_ORDINE) o;
        System.out.println("L'ordine è nello stato "+statoOrdine);

        switch(statoOrdine) {
            case IN_PREPARAZIONE:
                System.out.println("Prende atto");
                break;
            case PRONTO:
                System.out.println("Vado a prendere l'ordine per portarlo al tavolo");
                break;
            default:
                System.out.println("Non mi interessa...");

        }

    }
}
