package it.unipegaso.business.strategy;

import it.unipegaso.model.Commento;

import java.util.Comparator;
import java.util.List;

public class CommentiMiglioriStrategy implements IOrdinamentoCommentiStrategy {

    @Override
    public void ordina(List<Commento> listaCommenti) {

        listaCommenti.sort(new Comparator<Commento>() {
            @Override
            public int compare(Commento c1, Commento c2) {

                int punteggio1=0, punteggio2=0;

                switch(c1.getPunteggio()) {
                    case SCARSO: punteggio1=1; break;
                    case MEDIOCRE: punteggio1=2; break;
                    case BUONO: punteggio1=3; break;
                    case ECCELLENTE: punteggio1=4; break;
                }

                switch(c2.getPunteggio()) {
                    case SCARSO: punteggio2=1; break;
                    case MEDIOCRE: punteggio2=2; break;
                    case BUONO: punteggio2=3; break;
                    case ECCELLENTE: punteggio2=4; break;
                }

                return punteggio2-punteggio1;
            }
        });
    }
}
