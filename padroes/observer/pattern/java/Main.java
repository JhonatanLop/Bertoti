package observer.pattern.java;

public class Main {
    public static void main(String[] args) {
        Skinao lanchonete = new Skinao();
        Caixa caixa = new Caixa();
        Cozinha cozinha = new Cozinha();

        lanchonete.registerObserver(caixa);
        lanchonete.registerObserver(cozinha);
        
        Pedido lanche = new Pedido("Cachorrão brabo", 17.00);
        
        lanchonete.notifyObserver(lanche);
    }
}
