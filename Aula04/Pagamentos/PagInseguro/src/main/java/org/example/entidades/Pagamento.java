package org.example.entidades;

public class Pagamento {
    private int id;
    private String nomeCliente;
    private double valor;
    private String data;

    public Pagamento(String nomeCliente, double valor, String data) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }else{
            System.out.println("Valor invalido");
        }
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
