package facade.anti.java;

public class Pedido {
    public String nome;
    public double valor;
    public double pagamento;
    public double troco;

    public Pedido(String nome, double valor, double pagamento) {
        this.nome = nome;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public Pedido() {}

    public String getNome() { return nome; }
    public double getValor() { return valor; }
    public double getPagamento() { return pagamento; }
    public double getTroco() { return troco; }
    public void setNome(String nome) { this.nome = nome; }
    public void setValor(double valor) { this.valor = valor; }
    public void setPagamento(double pagamento) { this.pagamento = pagamento; }
    public void setTroco(double troco) { this.troco = troco; }}
