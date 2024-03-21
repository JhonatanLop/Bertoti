package observer.pattern.java;

public class Caixa implements Observer{
    public void update(Pedido pedido){
        display(pedido.getPreco());
    }

    public void display(double preco){
        System.out.println("#----------Caixa----------#");
        System.out.println("Novo pedido efetuado!");
        System.out.println("Valor: " + preco);
    }
}
