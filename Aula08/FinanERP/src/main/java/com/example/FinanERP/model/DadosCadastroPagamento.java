package com.example.FinanERP.model;

import java.time.LocalDate;

public record DadosCadastroPagamento(

        Tipo tipo, //Entrada ou Saida
        String nome_cliente,
        TipoSaida tipoSaida,
        double valor,
        LocalDate data_pagamento,
        String descricao
) {

}
