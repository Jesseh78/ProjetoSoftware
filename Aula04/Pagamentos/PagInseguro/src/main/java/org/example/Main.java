package org.example;

import org.example.entidades.Pagamento;
import org.example.model.PagementoCreateDAO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor de pagamento: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a data do pagamento: ");
        String data = sc.nextLine();

        Pagamento pagamento = new Pagamento(nome, valor, data);

        PagementoCreateDAO dao = new PagementoCreateDAO();
        dao.insert(pagamento);


        sc.close();
    }
}