package Conta;

public class MainContas {
    public static void main(String[] args) {
        ContaMes janeiro = new ContaMes();
        ContaMes fevereiro = new ContaMes();

        //gastos janeiro
        janeiro.agua = 300;
        janeiro.luz = 200;
        janeiro.alimentacao = 200;

        // gastos fevereiro
        fevereiro.agua = 300;
        fevereiro.luz = 200;
        fevereiro.alimentacao = 200;

        // calculo de gastos
        double gastos_jan = janeiro.somaConta();
        double gastos_fev = fevereiro.somaConta();

        if (gastos_fev > gastos_jan) {
            System.out.println("Os gastos de fevereiro foram maiores");
        } else if (gastos_fev < gastos_jan) {
            System.out.println("Os gastos de janeiro foram maiores");
        } else {
            System.out.println("Os gastos foram iguais");
        }

    }
}
