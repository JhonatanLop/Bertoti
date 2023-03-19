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

    public Integer carregar(int qtdMunicao, int capacidade) {
        System.out.println("vc tem " + qtdMunicao + " munições");
        System.out.println("Deseja encher o carregaor?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        resp = leia.nextInt();
        if (resp == 1) {
            System.out.println("carregando...");
            qtdMunicao = capacidade;
        }
        System.out.println("Seu carregador agora tem "+ qtdMunicao + " munições");
        return qtdMunicao;
    }

    public Integer descarregar(int qtdMunicao) {
        System.out.println("Você tem " + qtdMunicao + " munições");
        System.out.println("Deseja esvaziar o carregador?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        resp = leia.nextInt();
        if (resp == 1) {
            System.out.println("Descarregando...");
            qtdMunicao-= qtdMunicao;
        }
        System.out.println("Seu carregador está zerado!");
        return qtdMunicao;
    }

    public Carregador cadastrarCarregador() {
        Carregador magazineCarregador = new Carregador();

        magazineCarregador.corTransportador = "laranja";
        magazineCarregador.tipoAlinhamento = "inline";
        magazineCarregador.capacidade = 7;
        magazineCarregador.qtdMunicao = 3;
        return magazineCarregador;
    }

    public static void main(String[] args) {
    }
}
