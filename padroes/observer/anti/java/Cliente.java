public class Cliente{

    private String nome;
    private String numero;

    public Cliente(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    public String update(){
        return "o item que você queria chegou";
    }
}