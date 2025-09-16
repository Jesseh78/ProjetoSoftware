import entidades.Filmes;
import entidades.Genero;
import entidades.Series;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja informar:");
        System.out.println("1 - Filme");
        System.out.println("2 - Série");
        int opcao = sc.nextInt();

        System.out.println("Digite o nome do filme/série: ");
        String nomeFilme = sc.nextLine();

        System.out.println("Digite o nome do protagonista");
        String protagonista = sc.nextLine();

        System.out.println("Digite o nome do diretor: ");
        String diretor = sc.nextLine();

        System.out.println("Digite o genero do filme/série: ");
        Genero genero = Genero.valueOf(sc.nextLine());

        System.out.println("Informe a classificação do filme/série: ");
        int classificacao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            System.out.println("Informe a duração do filme");
            int duracao = sc.nextInt();
            sc.nextLine();
            Filmes filme1 = new Filmes(nomeFilme, protagonista, diretor, genero, classificacao, duracao);
            System.out.println(filme1.toString());

        }else if (opcao == 2) {
            System.out.println("Informe a quantidade de temporadas da série");
            int temporadas = sc.nextInt();

            System.out.println("Informe a quantidade de episodios por temporada");
            int episodios = sc.nextInt();
            Series serie1 = new Series(nomeFilme, protagonista, diretor, genero, classificacao, temporadas, episodios);
            System.out.println(serie1.toString());
            
        }else{
            System.out.println("Opcao invalida");
        }


        sc.close();
    }
}