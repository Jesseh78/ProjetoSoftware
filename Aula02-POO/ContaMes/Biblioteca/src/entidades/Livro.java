package entidades;

public class Livro {
    public String titulo;
    public String autor;
    public int quantidade = 0;
    public double valor = 0;

    public Livro(String titulo, String autor, int quantidade, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "------------ " +
                "\ntitulo: " + titulo +
                "\nautor: " + autor +
                "\nquantidade: " + quantidade +
                "\nvalor: R$" + valor+
                "----------";
    }
    public int emprestarLivro() {
        return 0;
    }
}
