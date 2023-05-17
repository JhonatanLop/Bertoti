package com.firearm.acoes;

import java.util.Scanner;
import java.util.List;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;
import com.firearm.fabricaveis.Item;

public class UtilsGuns {
    static Scanner leia = new Scanner(System.in);

    public static int magCompativel(Arma arma, List<Carregador> carregadores) {
        int indice = 0;
        int index = 0;
        for (Carregador carregador : carregadores) {
            if (arma.getArmaCalibre() == carregador.getCalibreCarregador()) {
                index = indice;
            }
        }
        return index;
    }

    public static void listagemArma(List<Arma> armas) {
        int indice = 1;

        // lista as armas
        System.out.println("Lista de Armas:");
        // faz um loop e a cada iteração ele mostra um iten da lista
        for (Arma a : armas) {
            System.out.println((indice + " - ") + a.getNome() + "\n");
            indice++;
        }

        // confirmação da compra da arma
        // System.out.println("Gostaria de comprar a arma:");
        // System.out.println("Nome: " + arma.getNome());
        // System.out.println("Tipo: " + arma.getTipo());
        // System.out.println("Marca: " + arma.getMarca());
        // System.out.println("Calibre: " + arma.getArmaCalibre());
        // System.out.println("Tamanho: " + arma.getTamanho() + "cm");
        // System.out.println("Peso: " + arma.getPeso() + "Kg");
        // System.out.println("Alcance:" + arma.getAlcance() + "m²");
    }
}
