package Variaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Seu nome é " + nome);


        entrada.close();
    }
}
