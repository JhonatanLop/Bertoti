package Classes.fabricaveis;

import java.util.Scanner;

public class Carregador extends Item{
    static Scanner leia = new Scanner(System.in); 

    String marca;
    String corTransportador;
    String tipoAlinhamento;
    int capacidade;
    int qtdMunicao;
    Municao tipoMunicao;

    public Integer carregar(int qtdMunicao, int capacidade, Municao tipoMunicao) {
        int resp;
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

    public Integer descarregar(int qtdMunicao) {
        int resp;
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

    // construtor do carregador
    public Carregador() {
        // criando munição
        Municao newBullet = new Municao();
        
        System.out.println("------Carregador------");
        System.out.println("Qual é a marca?");
        marca = leia.nextLine();
        System.out.println("Cor do transportador:");
        corTransportador = leia.next();
        System.out.println("Tipo do carregador:");
        tipoAlinhamento = leia.nextLine();
        System.out.println("Capacidade:");
        capacidade = leia.nextInt();
        System.out.println("Quantidade de munições atual:");
        qtdMunicao = leia.nextInt();
        tipoMunicao = newBullet;
    }

    // public static Carregador cadastrarCarregador() {
    //     Carregador magazineCarregador = new Carregador();
    //     System.out.println("Cor do transportador:");
    //     magazineCarregador.corTransportador = leia.next();
    //     System.out.println("Tipo do carregador:");
    //     magazineCarregador.tipoAlinhamento = leia.next();
    //     System.out.println("Capacidade:");
    //     magazineCarregador.capacidade = leia.nextInt();
    //     System.out.println("Quantidade de munições atual:");
    //     magazineCarregador.qtdMunicao = leia.nextInt();
    //     return magazineCarregador;
    // }

    // public static void main(String[] args) {
    //     Carregador newMag = new Carregador();
    //         System.out.println("Cor do transportador:");
    //         newMag.corTransportador = leia.next();
    //         System.out.println("Tipo do carregador:");
    //         newMag.tipoAlinhamento = leia.next();
    //         System.out.println("Capacidade:");
    //         newMag.capacidade = leia.nextInt();
    //         System.out.println("Quantidade de munições atual:");
    //         newMag.qtdMunicao = leia.nextInt();
    //         // tipoMunicao = objeto da classe Municao;
    //         // newMag.tipoMunicao = municao;

    //     newMag.qtdMunicao = carregar(newMag.qtdMunicao, newMag.capacidade);
    //     newMag.qtdMunicao = descarregar(newMag.qtdMunicao);
    // }
}