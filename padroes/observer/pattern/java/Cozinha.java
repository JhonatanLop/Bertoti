package observer.pattern.java;

public class Cozinha implements Observer{

    public void update(Pedido pedido) {
        display(pedido.getLanche());
    }

    public void display(String lanche) {
        System.out.println("#---------Cozinha---------#");
        System.out.println("Atenção, pedido novo!");
        System.out.println("preparar : " + lanche);
    }
    
}
