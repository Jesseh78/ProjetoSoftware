package entidades;

public class Filmes extends Catalogo{
    private int duracao;

    public Filmes(String nomeFilme, String protagonista, String diretor, Genero genero, int classificacao, int duracao) {
        super(nomeFilme, protagonista, diretor, genero, classificacao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\nDuracao do filme: " + duracao ;
    }
}
