package com.firearm.acoes;

import java.util.List;
import java.util.Scanner;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;

public class Loja {
    static Scanner leia = new Scanner(System.in);

    Double preco;
    static int menu;
    
    static public void vender() {
        
        // menu
        System.out.println("Oque gostaria de comprar?");
        System.out.println("1 - Arma");
        System.out.println("2 - carregadores");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                // compra arma
                Loja.comprarArma(0,1);
                break;
            case 2:
                // compra carregador
                Loja.comprarMag(0, 1);
                break;
            default:
                System.out.println("Fora do escopo!");
                break;
        }

        System.out.println("Gostaria de comprar mais alguma coisa?\n 1 - Sim\n 2 - Não");
        int resp = leia.nextInt();
        if (resp == 1) {
            vender();
        } else {
            System.out.println("Ok, volte sempre!");
        }
        System.out.println("\nGostaria de fazer oque?\n1 - Comprar equipamentos\n2 - Usar equipamentos");
        int opcao = leia.nextInt();
        Controlador.controlarPersonagem(opcao,0);
    }

    public static void comprarArma(int n, int condition) {
        List<Arma> armasLoja = Fabrica.arsenalArmas;
        
        UtilsGuns.listagemArma(armasLoja);
        Arma arma = armasLoja.get(n);
        Controlador.armas.add(arma);
        Fabrica.arsenalArmas.remove(n);
    }

    static public void comprarMag(int n, int condition) {
        List<Carregador> carregadoresFab = Fabrica.arsenalMag;

        UtilsGuns.listagemCarregador(carregadoresFab);
        Carregador carregador = Fabrica.arsenalMag.get(n);
        Controlador.carregadores.add(carregador);
        carregadoresFab.remove(carregador);
    }
}
