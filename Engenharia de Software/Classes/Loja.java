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
                //         int indice = i + 1;
                //         System.out.println(Fabrica.getArsenalArmas(i) + "-" + indice + "\n");
                //     }
                // int indice = 1;
                // System.out.println("Lista de Armas:");
                // for (Arma a : Fabrica.getArsenalArmas()) {
                //     System.out.println((indice + " - " ) + a + "\n");
                //     indice++;
                // }
                // // seleciona arma
                // System.out.println("Selecione uma arma:");
                // int armaIndex = leia.nextInt();
                // Arma arma = Fabrica.getArsenalArmas().get(armaIndex - 1);
                // opcao
                // int opcao = leia.nextInt();
                // switch (opcao) {
                //     case 1:
                //         // compra arma
                //         // retira arma da lista
                //         // System.out.println("Voce comprou a arma " + arma);
                //         break;
                //     case 2:
                //         // nao compra arma
                //         System.out.println("Gostaria de comprar outra arma? \n1 - Sim \n2 - Nao");
                //         int resp = leia.nextInt();
                //         if (resp == 1) {
                //             return;
                //         } else if (resp == 2){
                //         }
                //         break;
                //     default:
                //         break;
                // }
                // break;

                UtilsGuns.comprarArma();

            case 2:
                // lista carregadores
                // System.out.println("Lista de Balas:");
                // for (int i = 0; i < arsenalArmas.size(); i++) {
                //     int indice = 1;
                //     System.out.println(arsenalMag.get(i) + "-" + indice + "\n");
                // }

                UtilsGuns.comprarMag();

                break;

            case 3:
                // lista balas
                // System.out.println("Lista de balas:");
                // for (int i = 0; i < arsenalBuller.size(); i++) {
                //     int indice = 1;
                //     System.out.println(arsenalBuller.get(i) + "-" + indice + "\n");
                // }
                UtilsGuns.comprarMunicao();
            default:
                break;
        }
    }
}
