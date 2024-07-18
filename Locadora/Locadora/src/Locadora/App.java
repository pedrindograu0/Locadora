package Locadora;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crio um novo objeto "Scanner" que recebe o nome "scanner" para ler a entrada do usuário a partir do "System.in"
        
        while(true) {
            System.out.println("\nBem-vindo à Locatudo, a locadora mais famosa do Brasil.");
            
            try {
                System.out.println("\n1. Criar usuário");
                System.out.println("2. Fazer login");
                System.out.println("3. Encerrar programa");

                System.out.print("\nEscolha a opção desejada: ");
                int escolha = scanner.nextInt();
                scanner.nextLine();
       
                switch(escolha) {
                    case 1: 
                        System.out.println("\nVocê escolheu a opção Criar usuário: ");
                        	Cadastro.cadastrar();
                        break;
                    case 2: 
                        System.out.println("\nVocê escolheu a opção Fazer login: ");
                        break;
                    case 3: 
                        System.out.println("\nEncerrando o programa...");
                        scanner.close();
                        return; 
                    default:
                        System.out.println("\nOpção inválida. Por favor, escolha uma das opções listadas.");
                        
                }
            } catch (Exception e) {
                System.out.println("\nErro: Entrada inválida. Por favor, digite apenas números.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }
}