package com.example.FinanERP.model;
import java.time.LocalDate;
public record AtualizacaoPagamento(
        long id,
        String nomeCliente,
        double valor,
        LocalDate dataPagamento,
        String descricao
        ) {

}
