package Locadora;

public class Filme {
    private String titulo;
    private String diretor;
    private String duracao;
    private double preco;
    private boolean disponivel;

    public Filme(String titulo, String diretor, String duracao, double preco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
        this.disponivel = true; // Inicialmente o filme está disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Método para alugar o filme
    public void alugar() {
        if (disponivel) {
            disponivel = false; // Marca o filme como não disponível após alugado
            System.out.println("Filme alugado com sucesso!");
        } else {
            System.out.println("Este filme não está disponível para aluguel no momento.");
        }
    }

    // Método para pagar o filme
    public void pagar() {
        if (!disponivel) {
            System.out.println("Pagamento realizado com sucesso: R$" + preco);
            disponivel = true; // Marca o filme como disponível após o pagamento
        } else {
            System.out.println("Não há filmes para pagar no momento.");
        }
    }

    @Override
    public String toString() {
        return "Filme: " + titulo + "\nDiretor: " + diretor + "\nDuração: " + duracao + "\nValor: R$" + preco;
    }
}