package Conta;

public class ContaMes {
    public double agua;
    public double luz;
    public double alimentacao;

    public double somaConta(){
     double contaMes = agua + luz + alimentacao;
     return contaMes;
    }
}
