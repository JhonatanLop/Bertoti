package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    Scanner leia = new Scanner(System.in);
    
    Double preco;
    int menu;

    public void vender() {
        // menu
        System.out.println("Oque gostaria de comprar?");
        System.out.println("1 - Arma");
        System.out.println("2 - Balas");
        System.out.println("3 - carregadores");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                // lista armas
                // for (int i = 0; i < Fabrica.getArsenalArmas().size(); i++) {
                    //     int indice = i + 1;
                    //     System.out.println(arsenalArmas.get(i) + "-" + indice + "\n");
                    // }
                    
                System.out.println("Lista de Armas:");
                for (Arma a : Fabrica.getArsenalArmas()) {
                    System.out.println(a + "\n");
                }

                // seleciona arma
                System.out.println("Selecione uma arma:");
                int arma = leia.nextInt();
                break;

            case 2:
                // lista carregadores
                System.out.println("Lista de Balas:");
                for (int i = 0; i < arsenalArmas.size(); i++) {
                    int indice = 1;
                    System.out.println(arsenalMag.get(i) + "-" + indice + "\n");
                }

                break;

            case 3:
                // lista balas
                System.out.println("Lista de balas:");
                for (int i = 0; i < arsenalBuller.size(); i++) {
                    int indice = 1;
                    System.out.println(arsenalBuller.get(i) + "-" + indice + "\n");
                }
            default:
                break;
        }
    }
}
