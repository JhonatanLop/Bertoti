package com.firearm.acoes;

import java.util.Scanner;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;

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
}
