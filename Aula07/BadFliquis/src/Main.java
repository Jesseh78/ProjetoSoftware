import entidades.Filmes;
import entidades.Genero;
import entidades.Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nDeseja informar:");
            System.out.println("1 - Filme");
            System.out.println("2 - Série");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 0) {
                System.out.println("Fechando catálogo...");
                break;
            }

            System.out.print("Digite o nome do filme/série: ");
            String nomeFilme = sc.nextLine();

            System.out.print("Digite o nome do protagonista: ");
            String protagonista = sc.nextLine();

            System.out.print("Digite o nome do diretor: ");
            String diretor = sc.nextLine();

            System.out.print("Digite o gênero do filme/série: ");
            String generoStr = sc.nextLine().toUpperCase();
            Genero genero = Genero.valueOf(generoStr);

            System.out.print("Informe a classificação do filme/série: ");
            int classificacao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.print("Informe a duração do filme (minutos): ");
                int duracao = sc.nextInt();
                sc.nextLine();

                Filmes filme1 = new Filmes(nomeFilme, protagonista, diretor, genero, classificacao, duracao);
                System.out.println(filme1.toString());

            } else if (opcao == 2) {
                System.out.print("Informe a quantidade de temporadas da série: ");
                int temporadas = sc.nextInt();

                System.out.print("Informe a quantidade de episódios por temporada: ");
                int episodios = sc.nextInt();
                sc.nextLine();

                Series serie1 = new Series(nomeFilme, protagonista, diretor, genero, classificacao, temporadas, episodios);
                System.out.println(serie1.toString());

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
