package facade.anti.java;

public class Pedido {
    public String nome;
    public double valor;
    public double pagamento;
    public double troco;

    public Pedido(String nome, double valor, double pagamento) {
        this.nome = nome;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public Pedido() {}
}
