package entidades;

public abstract class Pagamento {
    private String nomeCliente, dataPagamento;
    private double valorPagamento;

    //Construtores


    public Pagamento(String nomeCliente, String dataPagamento, double valorPagamento) {
        this.nomeCliente = nomeCliente;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "\nnomeCliente: " + nomeCliente +
                "\ndataPagamento: " + dataPagamento  +
                "\nvalorPagamento: " + valorPagamento ;
    }
}
