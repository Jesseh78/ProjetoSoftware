package entidades;

public class Boleto extends Pagamento{
    private String codigoBarras;

    public Boleto(String nomeCliente, String dataPagamento, double valorPagamento, String codigoBarras) {
        super(nomeCliente, dataPagamento, valorPagamento);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "\nNome do cliente: " + getNomeCliente() +
                "\nData de pagamento: " + getDataPagamento()  +
                "\nValor do pagamento: " + getValorPagamento() +
                "\nCodigo de barras: " + getCodigoBarras();
    }
}
