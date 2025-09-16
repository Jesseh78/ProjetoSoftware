package entidades;

public class Series extends Catalogo{
    private int temporadas, episodios;

    public Series(String nomeFilme, String protagonista, String diretor, Genero genero, int classificacao, int temporadas, int episodios) {
        super(nomeFilme, protagonista, diretor, genero, classificacao);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTemporadas: " + temporadas +
                "\nEpisodios: " + episodios ;
    }
}
