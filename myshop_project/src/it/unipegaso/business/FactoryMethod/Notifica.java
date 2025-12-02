package it.unipegaso.business.FactoryMethod;

import it.unipegaso.model.Cliente;

public abstract class Notifica {

    private String msg;
    private Cliente cliente;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract void inviaNotifica();
}
