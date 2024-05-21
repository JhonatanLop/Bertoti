package facade.java;

public class Caixa {
    private Pedido pedido;
    private double troco;

    public double getTroco(Pedido pedido) { double troco = pedido.getPagamento() - pedido.getValor(); return troco; }
    public Pedido getPedido() { return pedido;}
    public void setPedido(Pedido pedido) { this.pedido = pedido;}
}
