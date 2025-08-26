package entidades;

public class ContaBancaria {
    private String nome, telefone;
    private int agencia, conta;
    private double saldo;

    public ContaBancaria(String nome, String telefone, int agencia, int conta, double saldo) {
        this.nome = nome;
        this.telefone = telefone;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    public void Sacar(double valor) {
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public void Depositar(double valor) {
        if (valor > 0 ){
            this.saldo += valor;
        }else{
            System.out.println("Depósito invalido!");
        }
    }

    @Override
    public String toString() {
        return  "---Conta bancaria---"+
                "\nNome: " + nome  +
                "\nTelefone: " + telefone +
                "\nAgencia:" + agencia +
                "\nConta=" + conta +
                "\nSaldo=" + saldo +
                "\n--------------------";
    }
}
