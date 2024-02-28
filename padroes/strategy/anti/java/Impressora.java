/**
 * Impressora
 */
public class Impressora {

    private StandardPrintStrategy standardPrintStrategy;

    public Impressora(StandardPrintStrategy standardPrintStrategy){
        this.standardPrintStrategy = standardPrintStrategy;
    }

    public printDocument(){
        System.out.println("imprimindo documento");
    }
}