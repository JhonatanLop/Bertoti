package facade.anti.java;

public class Cozinha {
    public Pedido pedido;

    public Cozinha() {}

    public void fazerPedido(Pedido pedido) {
        System.out.println("Fazendo pedido :" + pedido.nome);
    }
}
