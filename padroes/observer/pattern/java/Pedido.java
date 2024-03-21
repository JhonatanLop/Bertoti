package observer.pattern.java;

public class Pedido {
    private String lanche;
    private double preco;

    public Pedido(String lanche, double preco) {
        this.lanche = lanche;
        this.preco = preco;
    }

    public String getLanche() { return lanche; }
    public double getPreco() { return preco; }
    public void setLanche(String lanche) { this.lanche = lanche; }
    public void setPreco(double preco) { this.preco = preco; }
}
