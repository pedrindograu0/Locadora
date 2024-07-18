package Locadora;
 
public class Cliente {
    String nome;
    String senha;
    double saldo;
 
    public Cliente(String nome, String senha, double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }
 
    public String getNome() {
        return nome;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public void adicionarSaldo(double valor) {
        saldo += valor;
    }
 
    public boolean pagar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
 
    public String toString() {
        return "Cliente: " + nome + ", Saldo: R$" + saldo;
    }
}