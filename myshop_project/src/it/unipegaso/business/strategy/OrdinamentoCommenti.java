package it.unipegaso.business.strategy;

import it.unipegaso.model.Commento;

import java.util.List;

public class OrdinamentoCommenti {

    private List<Commento> listaCommenti;
    private IOrdinamentoCommentiStrategy ordinamentoCommentiStrategy;

    public OrdinamentoCommenti(List<Commento> listaCommenti) {
        this.listaCommenti = listaCommenti;
    }

    public void setOrdinamentoCommentiStrategy(IOrdinamentoCommentiStrategy ordinamentoCommentiStrategy) {
        this.ordinamentoCommentiStrategy = ordinamentoCommentiStrategy;
    }

    public void ordina() {
        ordinamentoCommentiStrategy.ordina(listaCommenti);
    }
}
