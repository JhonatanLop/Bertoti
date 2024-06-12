package facade.anti.java;

public class Lanchonete {
    private Pedido pedido;
    
    public void fazerPedido(String pedido, double valor, double pagamento){
        Pedido p = new Pedido(pedido, valor, pagamento);
        p.setValor(valor);
        p.setNome(pedido);
        p.setPagamento(pagamento);

        Cozinha c = new Cozinha();
        c.setPedido(p);
        c.fazerPedido(p);

        Caixa cx = new Caixa();
        cx.setPedido(p);

        System.out.println("Troco: " + p.getTroco());
    }

    public static void main(String[] args) {
        Lanchonete m = new Lanchonete();
        m.fazerPedido("Pizza", 50.0, 100.0);
    }
}
