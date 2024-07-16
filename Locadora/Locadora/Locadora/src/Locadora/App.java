package Locadora;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Bem-vindo à Locatudo, a locadora mais famosa do Brasil.");
            System.out.println("\n1. Criar usuário");
            System.out.println("2. Fazer login");
            System.out.println("3. Encerrar programa");

            System.out.print("\nEscolha a opção desejada: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt()

            switch(escolha) {
                case 1: 
                    System.out.println("\nVocê escolheu a opção Criar usuário ");
                    criarConta(scanner);
                    break;
                case 2: 
                    System.out.println("\nVocê escolheu a opção Fazer login ");
                    // Implementar lógica de login aqui
                    break;
                case 3: 
                    System.out.println("\nEncerrando o programa...");
                    scanner.close();
                    return; // Encerra o método main e, consequentemente, o programa
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
            }
        }
    }

    private static void criarConta(Scanner scanner) {
        // Aqui começa o processo de criação de usuário
        System.out.println("\nCriação do usuário:");
        System.out.println("Digite seu nome de usuário:");
        String nome = scanner.nextLine();
        
        System.out.println("\nVocê confirma esse nome " + nome + "?");
        String confirmacao = scanner.nextLine();
        
        if (confirmacao.equalsIgnoreCase("sim") || confirmacao.equalsIgnoreCase("s")) {
            System.out.println("Nome confirmado");
            // Aqui você pode prosseguir com a lógica de criação de conta, como salvar em um arquivo, etc.
            Escolha.decisao(); // Exemplo de chamada de método após confirmação
        } else {
            System.out.println("Nome não confirmado. Digite um nome de sua escolha.");
            criarConta(scanner); // Chama novamente o método para permitir nova entrada do usuário
        }
    }
}
