package acoes;

import java.util.List;
import java.util.Scanner;

import fabricaveis.Arma;
import fabricaveis.Carregador;
import fabricaveis.Item;
import fabricaveis.Municao;

public class Loja {
    static Scanner leia = new Scanner(System.in);

    Double preco;
    static int menu;

    static public Item vender() {
        // menu
        System.out.println("Oque gostaria de comprar?");
        System.out.println("1 - Arma");
        System.out.println("2 - Balas");
        System.out.println("3 - carregadores");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                // compra arma
                return comprarArma();
            case 2:
                // compra carregador
                return comprarMag();
            case 3:
                // compra munição
                return comprarMunicao();
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

    static public Arma comprarArma() {
        // lista as armas
        int indice = 1;
        List<Arma> armas = Fabrica.getArsenalArmas();
        
        System.out.println("Lista de Armas:");
        // faz um loop e a cada iteração ele mostra um item da lista
        for (Arma a : armas) {
            System.out.println((indice + " - ") + a + "\n");
            indice++;
        }

        // seleciona arma
        System.out.println("Selecione uma arma:");
        int armaIndex = leia.nextInt();
        // salva numa variável o objeto na posição selecionada
        Arma arma = Fabrica.getArsenalArmas().get(armaIndex - 1);

        // confirmação da compra da arma
        System.out.println("Gostaria de comprar a arma " + arma + "?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int condition = leia.nextInt();

        if (condition == 1) {
            // adiciona arma na classe
            // armas.add(arma);
            // retira arma da lista no indice selecionado
            Fabrica.arsenalArmas.remove(armaIndex - 1);
            System.out.println("Parabens pela compra!!");
        } else {
            System.out.println("Ok, volte sempre!");
        }
        return arma;
    }

    static public Carregador comprarMag() {
        // lista os carregadores
        System.out.println("Lista de Carregadores:");
        int indice = 1;
        // faz um loop e a cada iteração ele mostra um item da lista
        for (Carregador c : Fabrica.getArsenalMag()) {
            System.out.println((indice + " - ") + c + "\n");
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
        } else {
            System.out.println("Ok, volte sempre!");
        }
        return carregador;
    }

    public static Municao comprarMunicao() {
        // lista as munições disponíveis
        Municao municao = new Municao();
        return municao;
    }
}
