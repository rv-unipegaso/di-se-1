package it.unipegaso.business.observer;

import java.util.ArrayList;
import java.util.List;

public class Ordine implements Observable {

    public enum STATO_ORDINE { RICEVUTO, IN_PREPARAZIONE, PRONTO, PAGATO}

    private List<Observer> subscribers = new ArrayList<>();
    private STATO_ORDINE statoOrdine;

    public STATO_ORDINE getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(STATO_ORDINE statoOrdine) {
        if(this.statoOrdine != statoOrdine) {
            this.statoOrdine = statoOrdine;
            notifyObserver();
        }
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer subscriber : subscribers) {
            subscriber.notify(this.statoOrdine);
        }
    }
}
