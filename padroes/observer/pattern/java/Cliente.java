package observer.pattern.java;

public class Cliente implements Observer{
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void notificar(Produto produto) {
        System.out.println("Cliente " + nome + " notificado sobre o produto " + produto.getNome());
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
