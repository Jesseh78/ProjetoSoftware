import entidades.Caneta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caneta c1 = new Caneta();

        c1.marca = "";
        c1.modelo = "";
        c1.cor = "";

        System.out.println("Digite a marca da caneta: ");
        c1.marca = sc.nextLine();

        System.out.println("Digite o modelo da caneta: ");
        c1.modelo = sc.nextLine();

        System.out.println("Digite a cor da caneta: ");
        c1.cor = sc.nextLine();

        System.out.println("Digite se a caneta esta tampada (true/false): )");

        c1.exibirDados();


        sc.close();
    }
}