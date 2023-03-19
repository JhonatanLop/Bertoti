package Classes;

import java.util.Scanner;

public class Carregador {
    static Scanner leia = new Scanner(System.in);
    static int resp;

    String corTransportador;
    String tipoAlinhamento;
    int capacidade;
    int qtdMunicao;
    Municao tipoMunicao;

    public static Integer carregar(int qtdMunicao, int capacidade) {
        System.out.println("\nvc tem " + qtdMunicao + " munições");
        System.out.println("Deseja encher o carregador?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        resp = leia.nextInt();
        if (resp == 1) {
            System.out.println("\ncarregando...");
            qtdMunicao = capacidade;
        }
        System.out.println("Seu carregador agora tem " + qtdMunicao + " munições");
        return qtdMunicao;
    }

    public static Integer descarregar(int qtdMunicao) {
        System.out.println("\nVocê tem " + qtdMunicao + " munições");
        System.out.println("Deseja esvaziar o carregador?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        resp = leia.nextInt();
        if (resp == 1) {
            System.out.println("\n Descarregando");
            while (qtdMunicao != 0) {
                System.out.println("\n*puxa o ferrolho*\n *bala cai*");
                qtdMunicao --;
            }
        }
        System.out.println("\nSeu carregador está zerado!");
        return qtdMunicao;
    }

    public static Carregador cadastrarCarregador() {
        Carregador magazineCarregador = new Carregador();
        System.out.println("Cor do transportador: ");
        magazineCarregador.corTransportador = leia.next();
        System.out.println("Tipo do carregador: ");
        magazineCarregador.tipoAlinhamento = leia.next();
        System.out.println("Capacidade: ");
        magazineCarregador.capacidade = leia.nextInt();
        System.out.println("Quantidade de munições atual: ");
        magazineCarregador.qtdMunicao = leia.nextInt();
        return magazineCarregador;
    }

    public static void main(String[] args) {
        Carregador newMag = cadastrarCarregador();
        newMag.qtdMunicao = carregar(newMag.qtdMunicao, newMag.capacidade);
        newMag.qtdMunicao = descarregar(newMag.qtdMunicao);
    }
}