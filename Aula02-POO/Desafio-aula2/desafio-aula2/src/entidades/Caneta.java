package entidades;

public class Caneta {
    public String marca;
    public String modelo;
    public String cor;
    public boolean tampada = false;

        public void exibirDados(){
            System.out.println("---Exibição de dados---\n Marca: "+ marca
            + "\n Modelo: "+ modelo
            + "\n Cor: "+ cor
            + "\n Tampada: "+ tampada
            + "\n ----------------------");
        }
}
