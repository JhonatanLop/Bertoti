package Classes;
import java.util.Scanner;

public class Municao {
    static Scanner leia = new Scanner(System.in);
    
    String nome;
    String calibre;
    String tipoPonta;
    String tipoMunicao;
    // em gramas
    double peso;
    // em m/s
    int velocidade;

    // criando construtor
    public Municao() {
        System.out.println("------Munição------");
        System.out.println("Nome da  munição:");
        nome = leia.nextLine();
        System.out.println("Qual o calibre?");
        calibre = leia.nextLine();
        System.out.println("Tipo de Ponta:");
        tipoPonta = leia.nextLine();
        System.out.println("Tipo de Munição:");
        tipoMunicao = leia.nextLine();
        System.out.println("Gramagem da munição:");
        peso = leia.nextDouble();
        System.out.println("Velocidade do projétil:");
        velocidade = leia.nextInt();
    }
    // public static Municao cadastrarMunicao() {
    //     Municao municao = new Municao();
    //     System.out.println("Calibre: ");
    //     municao.calibre = leia.next();
    //     System.out.println("Tipo de ponta: ");
    //     municao.tipoPonta = leia.next();
    //     System.out.println("Tipo de munição: ");
    //     municao.tipoMunicao = leia.next();
    //     System.out.println("Peso (em gramas): ");
    //     municao.peso = leia.nextDouble();
    //     System.out.println("Velocidade do projétil (m/s): ");
    //     municao.velocidade = leia.nextInt();
    //     return municao;
    // }

    // public static void main(String[] args) {
    //     // Municao newBullet = cadastrarMunicao();
    //     Municao municao = new Municao();
    //     System.out.println("Calibre: ");
    //     municao.calibre = leia.next();
    //     System.out.println("Tipo de ponta: ");
    //     municao.tipoPonta = leia.next();
    //     System.out.println("Tipo de munição: ");
    //     municao.tipoMunicao = leia.next();
    //     System.out.println("Peso (em gramas): ");
    //     municao.peso = leia.nextDouble();
    //     System.out.println("Velocidade do projétil (m/s): ");
    //     municao.velocidade = leia.nextInt();
    // }
}
