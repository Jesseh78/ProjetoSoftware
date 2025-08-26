import entidades.ContaBancaria;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Desafio de criar um programa para conta bancaria

        ContaBancaria conta1 = new ContaBancaria("Joao", "(11)90000-0000", 140, 0006, 0);
        conta1.setNome("José");
        conta1.Depositar(100);
        conta1.Sacar(75);
        //System.out.println(conta1.getSaldo());
        System.out.println(conta1.toString());
    }
}