package facade.pattern.java;

public class Pedido {
    private String nome;
    private double valor;
    private double pagamento;

    public Pedido(String nome, double valor, double pagamento) {
        this.nome = nome;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public String getNome() { return nome; }
    public double getValor() { return valor; }
    public double getPagamento() { return pagamento; }
    public void setNome(String nome) { this.nome = nome; }
    public void setValor(double valor) { this.valor = valor; }
    public void setPagamento(double pagamento) { this.pagamento = pagamento; }
}
