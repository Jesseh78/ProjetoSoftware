package entidades;

public class Catalogo {
    private String nomeFilme,protagonista, diretor;
    private Genero genero;
    private int classificacao;

    public Catalogo(String nomeFilme, String protagonista, String diretor, Genero genero, int classificacao) {
        this.nomeFilme = nomeFilme;
        this.protagonista = protagonista;
        this.diretor = diretor;
        this.genero = genero;
        if (classificacao >= 0 && classificacao <= 5) {
        this.classificacao = classificacao;
        } else{this.classificacao = 0;}
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        if(classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        }else{
            System.out.println("Classificacao invalida");
        }
    }

    @Override
    public String toString() {
        return "----CATALOGO----" +
                "\nNome do filme: " + nomeFilme +
                "\nProtagonista: " + protagonista +
                "\nDiretor: " + diretor +
                "\nGenero: " + genero +
                "\nClassificacao: " + classificacao +
                "----------------";
    }
}
