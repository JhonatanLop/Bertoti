package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fabrica {

    static List<Arma> arsenalArmas = new ArrayList<>();
    static List<Carregador> arsenalMag = new ArrayList<>();
    static List<Municao> arsenalBuller = new ArrayList<>();

    Scanner leia = new Scanner(System.in);
    
    
    public void gerarArma() {
        System.out.println("Deseja gerar uma arma? (1)sim ou (2)nao");
        int resp = leia.nextInt();
        while (resp == 1) {
            Arma arma = new Arma();
            arsenalArmas.add(arma);
        }
    }
    public void gerarCarregador() {
        Carregador newMag = new Carregador();
    }

    static public List<Arma> getArsenalArmas() {
        return arsenalArmas;
    }
    public List<Carregador> getArsenalMag() {
        return arsenalMag;
    }
    public List<Municao> getArsenalBuller() {
        return arsenalBuller;
    }
    public Scanner getLeia() {
        return leia;
    }
}
