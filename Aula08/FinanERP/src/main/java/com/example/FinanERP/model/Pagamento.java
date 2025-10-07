package com.example.FinanERP.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

// anotação para identificar a tabela onde sera salvo os dados
@Table(name = "pagamentos")
@Entity(name = "Pagamento")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String nome_cliente;
    private double valor;
    private LocalDate data_pagamento;
    private String descricao;

    public Pagamento(DadosCadastroPagamento pagamento) {
        this.tipo = pagamento.tipo();
        this.nome_cliente = pagamento.nome_cliente();
        this.valor = pagamento.valor();
        this.data_pagamento = pagamento.data_pagamento();
        this.descricao = pagamento.descricao();
    }
}
