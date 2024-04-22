package facade.java;

public class Interface {
    private String pedido;
    private double pagamento;
    private double valor;

    public Interface(String pedido, double pagamento, double valor) {
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public void fazerPedido(){
        System.out.println("Fazendo pedido...");
        Pedido pedido = new Pedido(getPedido(), getValor());
        System.out.println("enviando para a cozinha...\n");
        enviarCozinha(pedido);

        System.out.println("contabilidade");
        
        System.out.println("total a pagar: ");
        chamarCaixa(pedido, getPagamento());

    }

    public void enviarCozinha(Pedido pedido){
        Cozinha cozinha = new Cozinha();
        cozinha.fazerPedido(pedido);
    }

    public double chamarCaixa(Pedido pedido, double pagamento) {
        Caixa caixa = new Caixa();
        return caixa.getTroco(pedido, pagamento);
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
