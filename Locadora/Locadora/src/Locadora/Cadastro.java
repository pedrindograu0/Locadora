package Locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    
    private static List<Cliente> clientes = new ArrayList<>();
    //Criei uma variável chamada "clientes" do tipo "List" e contém os elementos do tipo "Cliente"
    private static Scanner scanner = new Scanner(System.in);
    private static Cliente clienteLogado = null;
    
    public static void cadastrar() {
    	System.out.print("\nDigite o nome do novo cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a senha do cliente: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o saldo inicial do cliente: R$");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        if (encontrarClientePorNome(nome) != null) {
            System.out.println("Cliente já cadastrado.");
            return;
        }
        
        Cliente novoCliente = new Cliente(nome, senha, saldoInicial);
        clientes.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso.");
        Escolha.decisao();
        // Após cadastrar o cliente, chama o método Escolha.decisao()
    }
    
    public static boolean fazerLogin() {
        while (true) {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
     
            Cliente cliente = encontrarClientePorNome(nome);
     
            if (cliente != null && cliente.autenticar(senha)) {
                clienteLogado = cliente;
                System.out.println("Login bem-sucedido.");
                return true;
            } else if (cliente != null) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                System.out.println("Nome de cliente não encontrado. Tente novamente.");
            }
        }
    }
    
    public static void listarClientes() {
        System.out.println("\nClientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    
    public static void adicionarSaldo() {
        if (clienteLogado == null) {
            System.out.println("Nenhum cliente está logado.");
            return;
        }
        
        System.out.print("Digite o valor a ser adicionado: R$");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner após a entrada do valor
        clienteLogado.adicionarSaldo(valor);
        System.out.println("Saldo adicionado com sucesso.");
    }
    
    public static Cliente encontrarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (((String) cliente.getNome()).equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }
}
