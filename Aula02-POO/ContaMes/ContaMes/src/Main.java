//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // gastos janeiro
        double agua_jan = 100;
        double luz_jan = 200;
        double alimentar_jan = 300;

        // gastos fevereiro
        double agua_fev = 120;
        double luz_fev = 200;
        double alimentar_fev = 200;

        // gastos totais
        double gastos_jan = agua_fev + luz_fev + alimentar_fev;
        double gastos_fev = alimentar_fev + gastos_jan;


        if (gastos_fev > gastos_jan) {
            System.out.println("Os gastos de fevereiro foram maiores");
        } else if (gastos_fev < gastos_jan) {
            System.out.println("Os gastos de janeiro foram maiores");
        } else {
            System.out.println("Os gastos foram iguais");
        }
    }
}