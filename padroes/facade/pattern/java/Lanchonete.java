package facade.pattern.java;

public class Lanchonete {
    private Pedido pedido;
    
    public void fazerPedido(String pedido, double valor, double pagamento){
        Pedido p = new Pedido(pedido, valor, pagamento);
        fazerPagamento(p, pagamento);
        enviarCozinha(p);
    }

    public void enviarCozinha(Pedido p){
        Cozinha c = new Cozinha();
        c.setPedido(p);
        c.fazerPedido(p);
    }
    
    public void fazerPagamento(Pedido p, double pagamento){
        Caixa c = new Caixa();
        c.setPedido(pedido);

        System.out.println("Troco: " + c.calcularPagamento(p));
    }

    public static void main(String[] args) {
        Lanchonete m = new Lanchonete();
        m.fazerPedido("Pizza", 50.0, 100.0);
    }
}
