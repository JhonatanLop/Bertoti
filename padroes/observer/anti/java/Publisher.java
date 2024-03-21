public class Publisher {
    Cliente cliente[];

    
    public Publisher(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public void inscribe(Cliente cliente){
        System.out.println("Você será notificado quando o produto estiver disponível");
    }

    public void unsubscribe(Cliente cliente){
        System.out.println("você não será notificado quando o produto estiver disponível");
    }

    // 
    public void notifySubscribe(Cliente[] clientes){
        for (Cliente cliente : clientes) {
            // sem verificar se o produto é relevante para o usuário
            System.out.println("Enviando notificação que o produto chegou");
        }
    }
}