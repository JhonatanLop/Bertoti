package com.firearm.acoes;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;
import com.firearm.fabricaveis.Item;

public class Loja {
    static Scanner leia = new Scanner(System.in);

    Double preco;
    static int menu;
    
    static public void vender() {
        List<Item> carrinho = new ArrayList<Item>();
        
        // menu
        System.out.println("Oque gostaria de comprar?");
        System.out.println("1 - Arma");
        System.out.println("2 - carregadores");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                // compra arma
                Loja.comprarArma();
                break;
            case 2:
                // compra carregador
                Controlador.setCarregadores(Loja.comprarMag());
                Loja.comprarMag();
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
        Controlador.controlarPersonagem();
    }

    public static void comprarArma() {
        List<Arma> armasLoja = Fabrica.getArsenalArmas();
        
        System.out.println("Selecione uma arma:");
        // lista as armas
        UtilsGuns.listagemArma(armasLoja);
        int armaIndex = leia.nextInt();
        // salva numa variável o objeto na posição selecionada
        Arma arma = armasLoja.get(armaIndex - 1);

        System.out.println("\n1 - Sim");
        System.out.println("2 - Não");
        int condition = leia.nextInt();

        if (condition == 1) {
            // adiciona arma na lista
            Controlador.armas.add(arma);
            // retira arma da lista no indice selecionado
            Fabrica.arsenalArmas.remove(armaIndex - 1);
            System.out.println("Parabens pela compra!!");
        } else {
            System.out.println("Ok, volte sempre!");
        }
    }

    static public List<Carregador> comprarMag() {
        int indice = 1;
        List<Carregador> carredores = Fabrica.getArsenalMag();

        // lista os carregadores
        System.out.println("Lista de Carregadores:");
        // faz um loop e a cada iteração ele mostra um item da lista
        for (Carregador c : Fabrica.getArsenalMag()) {
            System.out.println((indice + " - ") + c.getMarca() + "\n");
            indice++;
        }

        // seleciona uma arma
        System.out.println("Selecione uma Carregador:");
        int carregadorIndex = leia.nextInt();
        Carregador carregador = Fabrica.arsenalMag.get(carregadorIndex - 1);

        // compra arma
        System.out.println("Gostaria de comprar o Carregador ");
        // confirmação de compra
        // System.out.println("Marca: " +carregador.getMarca());
        // System.out.println("Cor do Transportador: " +carregador.getCorTransportador());
        // System.out.println("Alinhamento: " +carregador.getTipoAlinhamento());
        // System.out.println("Calibre: " +carregador.getCalibreCarregador());
        // System.out.println("Capacidade: " +carregador.getCapacidade());
        // System.out.println("Munições: " +carregador.getQtdMunicao());
        // System.out.println("Tipo de Munição: " +carregador.getTipoMunicao());

        System.out.println("1 - Sim\n 2 - Não");
        int condition = leia.nextInt();
        if (condition == 1) {
            // adiciona na lista
            carredores.add(carregador);
            // remove da loja
            Fabrica.arsenalMag.remove(carregador);
            // System.out.println("Parabens pela compra!!");
        } 
        //else {
        //     // System.out.println("Ok, volte sempre!");
        // }
        return carredores;
    }
}
