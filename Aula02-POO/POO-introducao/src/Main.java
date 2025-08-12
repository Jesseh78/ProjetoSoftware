import entidades.Carro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c1 = new Carro();

        c1.cor = "";
        c1.marca = "";
        c1.ano = 2010;
        c1.modelo = "";
        c1.eletrico = false;

        System.out.println(("digite a marca do carro: "));
        c1.marca = sc.nextLine();

        System.out.println(("Digite o ano do carro: "));
        c1.ano = sc.nextInt();
        sc.nextLine();

        System.out.println(("Digite o modelo do carro: "));
        c1.modelo = sc.nextLine();

        c1.exibirDados();

        sc.close();
    }
}