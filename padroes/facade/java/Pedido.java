package facade.java;

public class Pedido {
    private String nome;
    private double valor;

    public Pedido(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void cozinhar() {
        System.out.println("enviando para cozinha...");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
