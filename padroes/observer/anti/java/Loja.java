package observer.anti.java;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Cliente> clientes;

    public Loja(){
        this.clientes = new ArrayList<>();
    }

    public void notificar(Produto produto) {
        for (Cliente cliente : clientes) {
            cliente.notificar(produto);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }   
}
