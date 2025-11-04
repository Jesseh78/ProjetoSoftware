package com.example.FinanERP.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

//Anotação para identificar a tabela aonde os dados serão salvos
@Table(name = "pagamentos")
@Entity (name = "Pagamento")
@EqualsAndHashCode(of = "id")

public class Pagamento {



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private String nomeCliente;
    private double valor;
    private LocalDate dataPagamento;
    private String descricao;


    public Pagamento(DadosCadastroPagamento pagamento) {
        this.tipo = pagamento.tipo();
        this.nomeCliente = pagamento.nomeCliente();
        this.valor = pagamento.valor();
        this.dataPagamento = pagamento.dataPagamento();
        this.descricao = pagamento.descricao();
    }

    public Pagamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void attInfo(AtualizacaoPagamento att) {
        if (att.nomeCliente() != null) {
            this.nomeCliente = att.nomeCliente();
        }
        if (att.valor() != 0) {
            this.valor = att.valor();
        }
        if (att.dataPagamento() != null) {
            this.dataPagamento = att.dataPagamento();
        }
        if (att.descricao() != null) {
            this.descricao = att.descricao();
        }
    }
}
