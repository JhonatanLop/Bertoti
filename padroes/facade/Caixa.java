package facade;

public class Caixa {
    private Pedido pedido;
    private double troco;
    
    public Caixa() {
    }

    public double getTroco(Pedido pedido, double vlRpago) {
        return troco;
    }
    public void setTroco(double troco) {
        this.troco = troco;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Pedido getPedido() {
        return pedido;
    }
}
