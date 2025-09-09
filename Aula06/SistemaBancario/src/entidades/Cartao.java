package entidades;

public class Cartao  extends Pagamento {
    private int nCartao;

    public Cartao(String nomeCliente, String dataPagamento, double valorPagamento, int nCartao) {
        super(nomeCliente, dataPagamento, valorPagamento);
        this.nCartao = nCartao;
    }

    public int getnCartao() {
        return nCartao;
    }

    public void setnCartao(int nCartao) {
        this.nCartao = nCartao;
    }
    @Override
    public String toString() {
        return "Pagamento: " +
                "\nNome do cliente: " + getNomeCliente() +
                "\nData de pagamento: " + getDataPagamento()  +
                "\nValor de pagamento: " + getValorPagamento() +
                "\nNumero do cartão: " + nCartao;
    }
}
