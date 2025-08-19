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
    public void emprestarLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        }else{
            System.out.println("Valor invalido");
        }
    }
    public void devolverLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade += quantidade;
        }else if(quantidade > this.quantidade){
            System.out.println("Devolveu livros a mais");
        }else{
            System.out.println("Valor invalido");
        }
    }
    public double valorTotal(){
        return this.quantidade * this.valor;
    }

    @Override
    public String toString() {
        return "------------ " +
                "\ntitulo: " + this.titulo +
                "\nautor: " + this.autor +
                "\nquantidade: " + this.quantidade +
                "\nvalor: R$" + this.valor+
                "\n----------";
    }
    public int emprestarLivro() {
        return 0;
    }
}
