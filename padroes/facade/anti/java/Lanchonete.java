package facade.anti.java;

public class Lanchonete {
    private Pedido pedido;
    
    public void fazerPedido(String pedido, double valor, double pagamento){
        Pedido p = new Pedido(pedido, valor, pagamento);
        p.setValor(valor);
        p.setNome(pedido);
        p.setPagamento(pagamento);
        fazerPagamento(p);

        enviarCozinha(p);
    }

    public void enviarCozinha(Pedido p){
        Cozinha c = new Cozinha();
        c.setPedido(p);
        c.fazerPedido(p);
    }
    
    public void fazerPagamento(Pedido p){
        Caixa c = new Caixa();
        c.setPedido(pedido);

        System.out.println("Troco: " + p.getTroco());
    }

    public static void main(String[] args) {
        Lanchonete m = new Lanchonete();
        m.fazerPedido("Pizza", 50.0, 100.0);
    }
}
