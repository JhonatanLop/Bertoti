package facade.anti.java;

public class Caixa {
    public Pedido pedido;

    public void calcularPagamento(Pedido pedido) {
        double troco = pedido.pagamento - pedido.valor;
        pedido.troco = troco;
    }

    public Pedido getPedido() { return pedido;}
    public void setPedido(Pedido pedido) { this.pedido = pedido;}
}
