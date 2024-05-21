package facade.java;

public class Caixa {
    private Pedido pedido;

    public void calcularPagamento(Pedido pedido) {
        double troco = pedido.getPagamento() - pedido.getValor();
        pedido.setTroco(troco);
    }

    public Pedido getPedido() { return pedido;}
    public void setPedido(Pedido pedido) { this.pedido = pedido;}
}
