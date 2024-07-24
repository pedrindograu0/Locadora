package Locadora;

import java.util.Scanner;

public class Login {
    private static Scanner leitor = new Scanner(System.in);

    public static void iniciar() {
        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = leitor.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = leitor.nextLine();
        
        // Verificar se as credenciais são válidas
        boolean loginSucesso = autenticar(nomeUsuario, senha);
        
        if (loginSucesso) {
            System.out.println("Login bem-sucedido.");
            Escolha.escolherFilme(null);
            // Por exemplo, redirecionar para o menu principal da locadora
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        	App.main(null);		
        }
    }

    private static boolean autenticar(String nomeUsuario, String senha) {
        // Encontrar cliente pelo nome de usuário
        Cliente cliente = Cadastro.encontrarClientePorNome(nomeUsuario);
        
        if (cliente != null && cliente.autenticarSenha(senha)) {
            Cadastro.definirClienteLogado(cliente); // Definir cliente como logado
            return true;
        }
        
        return false;
    }
}
