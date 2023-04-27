package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fabrica {

    static List<Arma> arsenalArmas = new ArrayList<>();
    static List<Carregador> arsenalMag = new ArrayList<>();
    static List<Municao> arsenalBullet = new ArrayList<>();

    Scanner leia = new Scanner(System.in);
    
    
    public void gerarArma() {
        System.out.println("Deseja gerar uma arma? (1)sim ou (2)nao");
        int resp = leia.nextInt();
        while (resp == 1) {
            Arma arma = new Arma();
            arsenalArmas.add(arma);
            // confirmação
            System.out.println("Deseja gerar uma nova arma? (1)sim ou (2)nao?");
            resp = leia.nextInt();
        }
    }
    public void gerarCarregador() {
        System.out.println("Deseja gerar um carregador? (1)sim ou (2)nao?");
        int resp = leia.nextInt();
        while (resp == 1) {
            Carregador mag = new Carregador();
            arsenalMag.add(mag);
            System.out.println("Deseja gerar um novo carregador? (1)sim ou (2)nao?");
            resp = leia.nextInt();
        }
    }
    public void gerarMunicao() {
        System.out.println("Deseja gerar uma munição? (1)sim ou (2)nao?");
        int resp = leia.nextInt();
        while (resp == 1) {
            Municao newBullet = new Municao();
            arsenalBullet.add(newBullet);
            System.out.println("Deseja gerar uma nova munição? (1)sim ou (2)não?");
        }

    }

    static public List<Arma> getArsenalArmas() {
        return arsenalArmas;
    }
    static public List<Carregador> getArsenalMag() {
        return arsenalMag;
    }
    static public List<Municao> getArsenalBuller() {
        return arsenalBullet;
    }
    public Scanner getLeia() {
        return leia;
    }
}
