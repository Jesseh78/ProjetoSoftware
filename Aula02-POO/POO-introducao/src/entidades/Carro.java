package entidades;

public class Carro {
    public String cor;
    public String marca;
    public int ano;
    public String modelo;
    public boolean eletrico;


    public void exibirDados(){
        System.out.println("Carro 1: "+
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nAno: " +ano+
                "\nModelo: "+modelo+
                "\nCarro elétrico: "+eletrico);
    }
}
