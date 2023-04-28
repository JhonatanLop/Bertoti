package Classes;

import java.util.Scanner;

import Classes.fabricaveis.Arma;
import Classes.fabricaveis.Carregador;
import Classes.fabricaveis.Municao;

public class UtilsGuns {
    static Scanner leia = new Scanner(System.in);
    
    static public void comprarArma() {
        int indice = 1;
        System.out.println("Lista de Armas:");
        for (Arma a : Fabrica.getArsenalArmas()) {
            System.out.println((indice + " - " ) + a + "\n");
            indice++;
        }

        // seleciona arma
        System.out.println("Selecione uma arma:");
        int armaIndex = leia.nextInt();
        Arma arma = Fabrica.getArsenalArmas().get(armaIndex - 1);

        // compra arma
        System.out.println("Gostaria de comprar a arma " + arma + "?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int condition = leia.nextInt();

        if (condition == 1) {
            Fabrica.arsenalArmas.remove(armaIndex - 1);
            System.out.println("Parabens pela compra!!");
        } else{
            System.out.println("Ok, volte sempre!");
            return;
        }
    }

    static public void comprarMag() {
        // lista os carregadores
        System.out.println("Lista de Carregadores:");
        int indice = 1;
        for (Carregador c : Fabrica.getArsenalMag()) {
            System.out.println((indice + " - " ) + c + "\n");
            indice++;
        }

        // seleciona uma arma
        System.out.println("Selecione uma Carregador:");
        int carregadorIndex = leia.nextInt();
        Carregador carregador = Fabrica.arsenalMag.get(carregadorIndex - 1);
        
        // compra arma
        System.out.println("Gostaria de comprar o Carregador" + carregador + "?\n 1 - Sim\n 2 - Não");
        int condition = leia.nextInt();
        if (condition == 1) {
            Fabrica.arsenalMag.remove(carregador);
            System.out.println("Parabens pela compra!!");
        } else{
            System.out.println("Ok, volte sempre!");
        }
    }

    public static void comprarMunicao() {
        // lista as munições disponíveis
        System.out.println("Lista de munições:");
        int indice = 1;
        for (Municao b : Fabrica.arsenalBullet) {
            System.out.println(indice + " - " + b + "\n");
            indice++;
        }

        // seleciona a munição
        System.out.println("Selecione a munição:");
        int municaoIndex = leia.nextInt();
        Municao municao = Fabrica.getArsenalBuller().get(municaoIndex -1);

        // confirmação de compra
        System.out.println("Gostaria de comprar a munição: " + municao + "? \n1 - Sim \n2 - Não");
        int resp = leia.nextInt();
        // retira munição da lista
        if (resp == 1) {
            Fabrica.arsenalBullet.remove(municaoIndex);
            System.out.println("Parabens pela compra!!");
        } else {
            System.out.println("Ok, volte sempre!");
        }
    }
}
