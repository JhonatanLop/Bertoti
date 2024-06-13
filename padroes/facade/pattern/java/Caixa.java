package facade.pattern.java;

public class Caixa {
    private Pedido pedido;

    public double calcularPagamento(Pedido pedido) {
        return pedido.getPagamento() - pedido.getValor();
    }

    public Pedido getPedido() { return pedido;}
    public void setPedido(Pedido pedido) { this.pedido = pedido;}
}
