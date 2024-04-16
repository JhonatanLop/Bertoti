package facade;

public class Interface {
    private String pedido;
    private double pagamento;
    private double valor;

    public Interface(String pedido, double pagamento, double valor) {
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public double fazerPedido(){
        System.out.println("Fazendo pedido...");
        Pedido pedido = new Pedido(getPedido(), getValor());
        System.out.println("enviando para a cozinha...");
        Cozinha cozinha = new Cozinha();
        Caixa caixa = new Caixa();
        cozinha.fazerPedido(pedido);
        double troco = caixa.getTroco(pedido);

        System.out.println("total a pagar: ");
    }

    public String getPedido() {
        return pedido;
    }
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
    public double getPagamento() {
        return pagamento;
    }
    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
