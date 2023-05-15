package Classes.Fabricaveis;

import java.util.Scanner;

import Classes.Fabricaveis.Municao.MunicaoType;

public class Carregador extends Item{
    static Scanner leia = new Scanner(System.in); 

    String marca;
    String corTransportador;
    String tipoAlinhamento;
    String calibreCarregador;
    int capacidade;
    int qtdMunicao;
    MunicaoType tipoMunicao;

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

    public Carregador(
    String marca,
    String corTransportador,
    String tipoAlinhamento,
    String calibreCarregador,
    int capacidade,
    int qtdMunicao,
    MunicaoType tipoMunicao){
        this.marca = marca;
        this.corTransportador = corTransportador;
        this.tipoAlinhamento = tipoAlinhamento;
        this.calibreCarregador = calibreCarregador;
        this.capacidade = capacidade;
        this.qtdMunicao = qtdMunicao;
        this.tipoMunicao = tipoMunicao;
    }
}