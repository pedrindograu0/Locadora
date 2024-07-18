package Locadora;

import java.util.Scanner;

public class Escolha {

    private static Scanner leitor = new Scanner(System.in);

    public static void decisao() {
        System.out.println("\nEscolha a opção de locação desejada:");
        System.out.println("1. Filmes");
        System.out.println("2. Jogos");
        System.out.println("3. Sair do programa");

        int escolha = lerInteiro();

        switch (escolha) {
            case 1:
                escolherFilme();
                break;
            case 2:
                escolherJogo();
                break;
            case 3:
                System.out.println("Encerrando o programa...");
                leitor.close();
                return;
            default:
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
        }
    }

    private static void escolherFilme() {
        System.out.println("\nEscolha o gênero de filme:");
        System.out.println("1. Ação");
        System.out.println("2. Comédia");
        System.out.println("3. Terror");
        System.out.println("4. Romance");

        int escolha = lerInteiro();

        switch (escolha) {
            case 1:
                listarFilmesAcao();
                break;
            case 2:
                listarFilmesComedia();
                break;
            case 3:
                listarFilmesTerror();
                break;
            case 4:
                listarFilmesRomance();
                break;
            default:
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
        }
    }

    private static void listarFilmesAcao() {
        System.out.println("\nFilmes de Ação:");
        System.out.println("1. Terra do Mal");
        System.out.println("2. X Rápido");
        System.out.println("3. John Wick 4");
        System.out.println("4. Rampage");
        System.out.println("5. Na Terra dos Santos e Pecadores");

        int escolha = lerInteiro();

        switch (escolha) {
            case 1:
                Filme terraDoMal = new Filme("Terra do Mal", "William Eubank", "1h 53min", 11.90);
                exibirDetalhesFilme(terraDoMal);
                break;
            case 2:
                Filme xRapido = new Filme("X Rápido", "Luís Leterrier", "2h 20min", 14.90);
                exibirDetalhesFilme(xRapido);
                break;
            case 3:
                Filme johnWick4 = new Filme("John Wick 4", "Chad Stahelski", "2h 49min", 9.90);
                exibirDetalhesFilme(johnWick4);
                break;
            case 4:
                Filme rampage = new Filme("Rampage", "Brad Peyton", "1h 43min", 5.90);
                exibirDetalhesFilme(rampage);
                break;
            case 5:
                Filme santosPecadores = new Filme("Na Terra dos Santos e Pecadores", "Roberto Lorenz", "1h 46min", 14.90);
                exibirDetalhesFilme(santosPecadores);
                break;
            default:
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
        }
    }

    private static void exibirDetalhesFilme(Filme filme) {
        System.out.println("\nDetalhes do filme:");
        System.out.println(filme);
        System.out.println("Deseja alugar este filme? (S/N)");
        String resposta = leitor.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            filme.alugar();
            System.out.println("Deseja pagar pelo filme agora? (S/N)");
            resposta = leitor.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                filme.pagar();
            }
        }
    }

    private static void listarFilmesComedia() {
        System.out.println("\nFilmes de Comédia:");
        System.out.println("1. Filme de Comédia 1");
        System.out.println("2. Filme de Comédia 2");
        System.out.println("3. Filme de Comédia 3");

        int escolha = lerInteiro();

        switch (escolha) {
            case 1:
                Filme comedia1 = new Filme("Filme de Comédia 1", "Diretor 1", "1h 30min", 9.90);
                exibirDetalhesFilme(comedia1);
                break;
            case 2:
                Filme comedia2 = new Filme("Filme de Comédia 2", "Diretor 2", "2h 15min", 12.90);
                exibirDetalhesFilme(comedia2);
                break;
            case 3:
                Filme comedia3 = new Filme("Filme de Comédia 3", "Diretor 3", "1h 50min", 11.90);
                exibirDetalhesFilme(comedia3);
                break;
            default:
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
        }
    }

    private static void listarFilmesTerror() {
        System.out.println("\nFilmes de Terror:");
        System.out.println("1. Filme de Terror 1");
        System.out.println("2. Filme de Terror 2");
        System.out.println("3. Filme de Terror 3");

        int escolha = lerInteiro();

        switch (escolha) {
            case 1:
                Filme terror1 = new Filme("Filme de Terror 1", "Diretor 4", "1h 40min", 10.90);
                exibirDetalhesFilme(terror1);
                break;
            case 2:
                Filme terror2 = new Filme("Filme de Terror 2", "Diretor 5", "2h 10min", 13.90);
                exibirDetalhesFilme(terror2);
                break;
            case 3:
                Filme terror3 = new Filme("Filme de Terror 3", "Diretor 6", "1h 55min", 11.90);
                exibirDetalhesFilme(terror3);
                break;
            default:
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
        }
    }

    private static void listarFilmesRomance() {
        System.out.println("\nFilmes de Romance:");
        System.out.println("1. Filme de Romance 1");
        System.out.println("2. Filme de Romance 2");
        System.out.println("3. Filme de Romance 3");

        int escolha = lerInteiro();

        switch (escolha) {
            case 1:
                Filme romance1 = new Filme("Filme de Romance 1", "Diretor 7", "2h 20min", 12.90);
                exibirDetalhesFilme(romance1);
                break;
            case 2:
                Filme romance2 = new Filme("Filme de Romance 2", "Diretor 8", "1h 45min", 11.90);
                exibirDetalhesFilme(romance2);
                break;
            case 3:
                Filme romance3 = new Filme("Filme de Romance 3", "Diretor 9", "2h 05min", 13.90);
                exibirDetalhesFilme(romance3);
                break;
            default:
                System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
        }
    }

    private static void escolherJogo() {
        // Implemente aqui a lógica para a opção de Jogos
        System.out.println("Funcionalidade de Jogos ainda não implementada.");
    }

    private static int lerInteiro() {
        while (!leitor.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número válido.");
            leitor.next(); // Limpa o buffer do Scanner
        }
        int escolha = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer do Scanner
        return escolha;
    }
}
