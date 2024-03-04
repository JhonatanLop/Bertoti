package composite.pattern.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Content{
    private String destino;
    private String recibo;
    private List<Content> conteudo;
    
    // caixa com objetos
    public Box(String destino, List<Content> conteudo, String recibo){
        this.destino = destino;
        this.conteudo = conteudo;
        this.recibo = recibo;
    }

    /**
    * Empacota o conteúdo da caixa com o destino e recibo especificados.
    * 
    * @param destino O destino para onde a caixa será enviada.
    * @param conteudo A lista de conteúdos a serem empacotados. A lista pode conter qualquer tipo que seja uma subclasse de Content.
    * @param recibo O recibo associado ao empacotamento da caixa.
    */
    public void empacotar(String destino, List<? extends Content> conteudo, String recibo){
        this.setDestino(destino);
        this.setConteudo(new ArrayList<>(conteudo));
        this.setRecibo(recibo);
    }

    public void despachar(){
        System.out.println(String.format("Pacote despachado para %s", destino));
    }

    public static void main(String[] args) {
        ContentBox obj1 = new ContentBox("notebook");
        ContentBox obj2 = new ContentBox("carregador");
        ContentBox obj3 = new ContentBox("mouse");

        Box caixa1 = new Box(null,null,null);
        Box caixa2 = new Box(null,null,null);
        Box caixa3 = new Box(null,null,null);

        caixa1.empacotar("jhow",Arrays.asList(obj1,obj2),"ReciboA");
        caixa2.empacotar("jhow",Arrays.asList(obj3),"ReciboB");
        caixa3.empacotar("jhow",Arrays.asList(caixa1,caixa2),"ReciboAB");
        
        caixa3.despachar();
    }

    public void setDestino(String destino) { this.destino = destino; }
    public void setRecibo(String recibo) { this.recibo = recibo; }
    public void setConteudo(List<Content> conteudo) { this.conteudo = conteudo; }
    public String getDestino() { return destino; }
    public String getRecibo() { return recibo; }
    public List<Content> getConteudo() { return conteudo; }
}