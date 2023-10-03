package com.projeto.curso.domain.enums;

public enum EstadoPagamento {

    PENDENTE (1,"Pagamento Pendente"),
    QUITADO  (2,"Pagamento Quitado"),
    CANCELADO (3,"Pagamento Cancelado");

    private int codigo;
    private String estatus;


    EstadoPagamento(int codigo, String estatus) {
        this.codigo = codigo;
        this.estatus = estatus;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEstatus() {
        return estatus;
    }
}
