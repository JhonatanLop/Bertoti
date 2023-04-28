package Classes;

import java.util.Scanner;

public class Loja {
    static Scanner leia = new Scanner(System.in);
    
    Double preco;
    static int menu;

    static public void vender() {
        // menu
        System.out.println("Oque gostaria de comprar?");
        System.out.println("1 - Arma");
        System.out.println("2 - Balas");
        System.out.println("3 - carregadores");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                // compra arma
                UtilsGuns.comprarArma();
                break;
            case 2:
                // compra carregador
                UtilsGuns.comprarMag();
                break;
            case 3:
                // compra munição
                UtilsGuns.comprarMunicao();
                break;
            default:
                System.out.println("Fora do escopo!");
                break;
        }
    }
}
