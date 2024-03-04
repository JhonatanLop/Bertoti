public class Cliente{

    private String nome;
    private String numero;
    private boolean isRelevant;

    public Cliente(String nome, String numero, boolean isRelevant){
        this.nome = nome;
        this.numero = numero;
        this.isRelevant = isRelevant;
    }

    public String notifyString(){
        return "o item que você queria chegou";
    }

    public String getNome() { return nome; }
    public String getNumero() { return numero; }
    public boolean isRelevant() { return isRelevant; }
    public void setNome(String nome) { this.nome = nome; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setRelevant(boolean isRelevant) { this.isRelevant = isRelevant; }}