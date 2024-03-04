package composite.pattern.java;

public class Box {
    String destino;
    String recibo;
    ContentBox[] subPacotes;
    Box[] pacotes;
    
    // caixa com objetos
    public Box(String destino, ContentBox[] subPacotes, String recibo){
        this.destino = destino;
        this.subPacotes = subPacotes;
        this.recibo = recibo;
    }

    // caixas com outras caixas
    public Box(String destino, Box[] pacotes, String recibo){
        this.destino = destino;
        this.pacotes = pacotes;
        this.recibo = recibo;
    }

    public void despachar(){
        System.out.println(String.format("Pacote despachado para %s", destino));
    }

    public static void main(String[] args) {
        ContentBox obj1 = new ContentBox("notebook");
        ContentBox obj2 = new ContentBox("carregador");
        ContentBox obj3 = new ContentBox("mouse");
        
        Box notebook = new Box("jhow",new ContentBox[]{obj1,obj2}, "ReciboA");
        Box mouse = new Box("jhow",new ContentBox[]{obj3}, "ReciboB");

        Box encomenda = new Box("jhow",new Box[]{notebook,mouse},"ReciboC");
        
        encomenda.despachar();
    }
}