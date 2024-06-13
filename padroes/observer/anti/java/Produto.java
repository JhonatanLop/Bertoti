package observer.anti.java;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private Loja loja;

    public Produto(String nome, double preco, int quantidade, Loja loja) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.loja = loja;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        loja.notificar(this);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        loja.notificar(this);
    }
}
