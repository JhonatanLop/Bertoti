public class Vendedor {
    private Loja loja;

    public Vendedor(Loja loja){
        this.loja = loja;
    }

    public void tipoVenda(){
        loja.venda();
    }
}
