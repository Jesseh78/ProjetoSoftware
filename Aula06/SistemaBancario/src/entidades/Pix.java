package entidades;

public class Pix extends Pagamento{
    private String chavePix;

    public Pix(String nomeCliente, String dataPagamento, double valorPagamento, String chavePix) {
        super(nomeCliente, dataPagamento, valorPagamento);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "\nnomeCliente: " + getNomeCliente() +
                "\ndataPagamento: " + getDataPagamento()  +
                "\nvalorPagamento: " + getValorPagamento() +
                "\ncodigoBarras: " + chavePix;
    }
}
