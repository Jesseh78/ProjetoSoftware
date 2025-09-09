import entidades.Boleto;
import entidades.Cartao;
import entidades.Pagamento;
import entidades.Pix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pagamento> pagamentos = new ArrayList<Pagamento>();

        while(true) {
            // menu de opções
            System.out.println("1 - Cadastrar pagamento");
            System.out.println("2 - Listar pagamentos");
            System.out.println("3 - Sair");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite o seu nome: ");
                String nomeCliente = sc.nextLine();

                System.out.println("Digite a data de pagamento: ");
                String dataPagamento = sc.nextLine();

                System.out.println("Digite o valor de pagamento: ");
                double valorPagamento = sc.nextDouble();
                sc.nextLine();

                // menu de métodos de pagamentos
                Pagamento pagamento = null;
                int metodos = sc.nextInt();
                sc.nextLine();

                System.out.println("Informe método de pagamento");
                System.out.println("1 - boleto");
                System.out.println("2 - PIX");
                System.out.println("3 - Cartão");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                switch (metodos) {
                    case 1:
                        System.out.println("Digite o código de barras: ");
                        String codigoBarras = sc.nextLine();
                        sc.nextLine();
                        pagamento = new Boleto(nomeCliente, dataPagamento, valorPagamento, codigoBarras);
                        System.out.println("Boleto cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Digite a chave pix: ");
                        String chavePix = sc.nextLine();
                        sc.nextLine();
                        pagamento = new Pix(nomeCliente, dataPagamento, valorPagamento, chavePix);
                        System.out.println("Pix cadastrado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Digite o numero do cartão: ");
                        int nCartao = sc.nextInt();
                        sc.nextLine();
                        pagamento = new Cartao(nomeCliente, dataPagamento, valorPagamento, nCartao);
                        System.out.println("Cartao cadastrado com sucesso!");
                        break;
                    case 0:
                        System.out.println("Fechando...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        continue;
                }
                pagamentos.add(pagamento);
            }
            else if (opcao.equals("2")) {
                System.out.println("Lista de pagamentos: ");
                for (Pagamento pagamento : pagamentos) {
                    System.out.println(pagamento.toString());
                }
                System.out.println("---------------------");
            }else{
                System.out.println("Finalizando processo...");
            }
            sc.close();
        }
    }
}