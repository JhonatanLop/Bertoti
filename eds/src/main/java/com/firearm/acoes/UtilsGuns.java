package com.firearm.acoes;

import java.util.Scanner;
import java.util.List;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;

public class UtilsGuns {
    static Scanner leia = new Scanner(System.in);

    public static Carregador magCompativel(Arma arma, List<Carregador> carregadores) {
        int index = 0;
        for (Carregador carregador : carregadores) {
            if (arma.getArmaCalibre() == carregador.getCalibreCarregador()) {
                Carregador courrentMag = carregadores.get(index);
                return courrentMag;
            }
            index++;
        }
        return null;
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
    }

    public static void listagemCarregador(List<Carregador> carregadores) {
        int indice = 1;

        // lista as armas
        System.out.println("Lista de Carregadores:");
        // faz um loop e a cada iteração ele mostra um iten da lista
        for (Carregador c : carregadores) {
            System.out.println((indice + " - ") + c.getMarca() + "\n");
            indice++;
        }
    }
}
