package com.projeto.curso.domain.enums;

public enum EstadoPagamento {

    PENDENTE(1, "Pagamento Pendente"),
    QUITADO(2, "Pagamento Quitado"),
    CANCELADO(3, "Pagamento Cncelado");
    private int cod;
    private String descricao;


    EstadoPagamento(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }
}
