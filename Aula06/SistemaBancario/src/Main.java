import entidades.Boleto;
import entidades.Cartao;
import entidades.Pagamento;
import entidades.Pix;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite a data de pagamento: ");
        String dataPagamento = sc.nextLine();

        System.out.println("Digite o valor de pagamento: ");
        double valorPagamento = sc.nextDouble();
        sc.nextLine();
        int opcoes;

            System.out.println("Informe método de pagamento");
            System.out.println("1 - boleto");
            System.out.println("2 - PIX");
            System.out.println("3 - Cartão");
            System.out.println("4 - exibir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            Pagamento pagamento = null;
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o código de barras: ");
                    String codigoBarras = sc.nextLine();
                    sc.nextLine();
                    pagamento = new Boleto(nomeCliente, dataPagamento, valorPagamento, codigoBarras);
                    System.out.println(pagamento.toString());
                    break;
                case 2:
                    System.out.println("Digite a chave pix: ");
                    String chavePix = sc.nextLine();
                    sc.nextLine();
                    pagamento = new Pix(nomeCliente, dataPagamento, valorPagamento, chavePix);
                    System.out.println(pagamento.toString());
                    break;
                case 3:
                    System.out.println("Digite o numero do cartão: ");
                    int nCartao = sc.nextInt();
                    sc.nextLine();
                    pagamento = new Cartao(nomeCliente, dataPagamento, valorPagamento, nCartao);
                    System.out.println(pagamento.toString());
                    break;
                case 0:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }



        sc.close();
    }
}