package com.projeto.curso.domain;

import javax.xml.crypto.Data;

public class Pedido {

    private Integer id;
    private Data instant;
    private Pagamento pagamento;
    private Cliente cliente;
    private Endereco enderecoDeEntrega;


    public Pedido(){
    }



}
