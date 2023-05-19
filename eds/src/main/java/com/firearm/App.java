package com.firearm;

import com.firearm.acoes.Fabrica;
import com.firearm.acoes.Controlador;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // gera armas e carregadores
        Fabrica.geradorArmas();
        Fabrica.geradorMag();

        // inicia o jogo
        System.out.println("\nGostaria de fazer oque?\n1 - Comprar equipamentos\n2 - Usar equipamentos");
        int opcao = leia.nextInt();
        Controlador.controlarPersonagem(opcao,0);
    }
}
