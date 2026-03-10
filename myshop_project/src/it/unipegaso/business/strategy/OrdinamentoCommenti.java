package it.unipegaso.business.strategy;

import it.unipegaso.model.Commento;

import java.util.List;

public class OrdinamentoCommenti {

    private List<Commento> commenti;
    private IOrdinamentoCommentiStrategy ordinamentoCommentiStrategy;

    public List<Commento> getCommenti() {
        return commenti;
    }

    public void setCommenti(List<Commento> commenti) {
        this.commenti = commenti;
    }

    public IOrdinamentoCommentiStrategy getOrdinamentoCommentiStrategy() {
        return ordinamentoCommentiStrategy;
    }

    public void setOrdinamentoCommentiStrategy(IOrdinamentoCommentiStrategy ordinamentoCommentiStrategy) {
        this.ordinamentoCommentiStrategy = ordinamentoCommentiStrategy;
    }

    public void ordina() {
        if(this.ordinamentoCommentiStrategy!=null)
            this.ordinamentoCommentiStrategy.ordina(this.commenti);
    }
}
