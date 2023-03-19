package Classes;
import java.util.Scanner;

public class Municao {
    Scanner leia = new Scanner(System.in);
    
    String calibre;
    String tipoPonta;
    String tipo_municao;
    // em gramas
    double peso;
    // em m/s
    int velocidade;
    public Municao cadastrarMunicao() {
        Municao bulletMunicao = new Municao();

        bulletMunicao.calibre = leia.next();
        bulletMunicao.tipoPonta = leia.next();
        // em gramas
        bulletMunicao.peso = leia.nextDouble();
        // m/s
        bulletMunicao.velocidade = leia.nextInt();
        return bulletMunicao;
    }

    public static void main(String[] args) {
    }
}
