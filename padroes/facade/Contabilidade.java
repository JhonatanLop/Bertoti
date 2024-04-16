package facade;

public class Contabilidade {
    private double gastos;
    private double caixa;
    private double lucro;
    
    public Contabilidade(double gastos, double caixa, double lucro) {
        this.gastos = gastos;
        this.caixa = caixa;
        this.lucro = lucro;
    }

    public double getGastos() {
        return gastos;
    }
    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    public double getCaixa() {
        return caixa;
    }
    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }
    public double getLucro() {
        return lucro;
    }
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}
