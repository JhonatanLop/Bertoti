package observer.anti.java;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Cliente cliente1 = new Cliente("João", "joao@gmail.com");
        Cliente cliente2 = new Cliente("Maria", "maria@gmail.com");

        Produto produto = new Produto("Camiseta", 50.0, 10, loja);

        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);
    
        produto.setPreco(45.0);
    }
}
