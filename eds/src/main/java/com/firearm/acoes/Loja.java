package com.firearm.acoes;

import java.util.List;
import java.util.Scanner;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;
import com.firearm.fabricaveis.Item;
import com.firearm.fabricaveis.Municao;

public class Loja {
    static Scanner leia = new Scanner(System.in);

    Double preco;
    static int menu;
    
    static public List<Item> vender() {
        List<Item> sacola = new List<Item>();
        
        // menu
        System.out.println("Oque gostaria de comprar?");
        System.out.println("1 - Arma");
        System.out.println("2 - carregadores");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                // compra arma
                List<Arma> carrinhoAr = (Loja.comprarArma());
                break;
            case 2:
                // compra carregador
                List<Carregador> carrinhoMag = (Loja.comprarMag());
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

        return null;
    }

    public static List<Arma> comprarArma() {
        // lista as armas
        int indice = 1;
        List<Arma> armas = Fabrica.getArsenalArmas();
        
        System.out.println("Lista de Armas:");
        // faz um loop e a cada iteração ele mostra um item da lista
        for (Arma a : armas) {
            System.out.println((indice + " - ") + a.getNome() + "\n");
            indice++;
        }

        // seleciona arma
        System.out.println("Selecione uma arma:");
        int armaIndex = leia.nextInt();
        // salva numa variável o objeto na posição selecionada
        Arma arma = Fabrica.getArsenalArmas().get(armaIndex - 1);

        // confirmação da compra da arma
        // System.out.println("Gostaria de comprar a arma:");
        // System.out.println("Nome: " + arma.getNome());
        // System.out.println("Tipo: " + arma.getTipo());
        // System.out.println("Marca: " + arma.getMarca());
        // System.out.println("Calibre: " + arma.getArmaCalibre());
        // System.out.println("Tamanho: " + arma.getTamanho() + "cm");
        // System.out.println("Peso: " + arma.getPeso() + "Kg");
        // System.out.println("Alcance:" + arma.getAlcance() + "m²");

        System.out.println("\n1 - Sim");
        System.out.println("2 - Não");
        int condition = leia.nextInt();

        if (condition == 1) {
            // adiciona arma na classe
            armas.add(arma);
            // retira arma da lista no indice selecionado
            Fabrica.arsenalArmas.remove(armaIndex - 1);
            System.out.println("Parabens pela compra!!");
        } else {
            System.out.println("Ok, volte sempre!");
        }
        return armas;
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
