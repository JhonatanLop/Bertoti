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
        List<Arma> armasLoja = Fabrica.getArsenalArmas();
        
        // System.out.println("Selecione uma arma:");
        // lista as armas
        UtilsGuns.listagemArma(armasLoja);
        // int n = leia.nextInt();
        // salva numa variável o objeto na posição selecionada
        Arma arma = armasLoja.get(n);
        // confirmação da compra da arma
        // System.out.println("Gostaria de comprar a arma:");
        // System.out.println("Nome: " + arma.getNome());
        // System.out.println("Tipo: " + arma.getTipo());
        // System.out.println("Marca: " + arma.getMarca());
        // System.out.println("Calibre: " + arma.getArmaCalibre());
        // System.out.println("Tamanho: " + arma.getTamanho() + "cm");
        // System.out.println("Peso: " + arma.getPeso() + "Kg");
        // System.out.println("Alcance:" + arma.getAlcance() + "m²");

        // System.out.println("\n1 - Sim\n2 - Não");
        // int condition = leia.nextInt();

        // if (condition == 1) {
        //     // adiciona arma na lista
            Controlador.armas.add(arma);
        //     // retira arma da lista no indice selecionado
            Fabrica.arsenalArmas.remove(n);
        //     // System.out.println("Parabens pela compra!!");
        // } else {
        //     // System.out.println("Ok, volte sempre!");
        // }
    }

    static public void comprarMag(int n, int condition) {
        List<Carregador> carregadoresFab = Fabrica.getArsenalMag();

        UtilsGuns.listagemCarregador(carregadoresFab);
        // lista os carregadores
        // System.out.println("Lista de Carregadores:");
        // faz um loop e a cada iteração ele mostra um item da lista
        // for (Carregador c : Fabrica.getArsenalMag()) {
        //     System.out.println((indice + " - ") + c.getMarca() + "\n");
        //     indice++;
        // }

        // seleciona uma arma
        // System.out.println("Selecione uma Carregador:");
        // int carregadorIndex = leia.nextInt();
        Carregador carregador = Fabrica.arsenalMag.get(n);

        // compra arma
        // System.out.println("Gostaria de comprar o Carregador ");
        // // confirmação de compra
        // System.out.println("Marca: " +carregador.getMarca());
        // System.out.println("Cor do Transportador: " +carregador.getCorTransportador());
        // System.out.println("Alinhamento: " +carregador.getTipoAlinhamento());
        // System.out.println("Calibre: " +carregador.getCalibreCarregador());
        // System.out.println("Capacidade: " +carregador.getCapacidade());
        // System.out.println("Munições: " +carregador.getQtdMunicao());
        // System.out.println("Tipo de Munição: " +carregador.getTipoMunicao());

        // System.out.println("\n1 - Sim\n2 - Não");
        // // int condition = leia.nextInt();
        // if (condition == 1) {
        //     // adiciona na lista
            Controlador.carregadores.add(carregador);
        //     // remove da loja
            carregadoresFab.remove(carregador);
        //     // System.out.println("Parabens pela compra!!");
        // } 
        //else {
        //     // System.out.println("Ok, volte sempre!");
        // }
    }
}
