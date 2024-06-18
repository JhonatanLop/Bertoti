package facade.anti.java;

public class Cozinha {
    public Pedido pedido;

    public Cozinha() {}

    public void fazerPedido(Pedido pedido) {
        System.out.println("Fazendo pedido :" + pedido.getNome());
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
