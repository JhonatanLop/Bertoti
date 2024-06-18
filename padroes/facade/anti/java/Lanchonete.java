package facade.anti.java;

public class Lanchonete {
    private Pedido pedido;
    
    public void fazerPedido(String pedido, double valor, double pagamento){
        Pedido p = new Pedido();
        p.valor = valor;
        p.nome = pedido;
        p.pagamento = pagamento;

        Cozinha c = new Cozinha();
        c.pedido = p;
        c.fazerPedido(p);

        Caixa cx = new Caixa();
        cx.setPedido(p);

        System.out.println("Troco: " + (pagamento - valor));
    }

    public static void main(String[] args) {
        Lanchonete m = new Lanchonete();
        m.fazerPedido("Pizza", 50.0, 100.0);
    }
}
