package Classes;
import java.util.Scanner;

public class Arma {
    Scanner leia = new Scanner(System.in);

    String tipo;
    String marca;
    String atirar;
    double peso;
    double alcance;
    double tamanho;
    Carregador carregador;

    public Integer atirar(int qtd_balas) {
        System.out.println("Atirar? s/n");
        atirar = leia.next();
        if (atirar == "s") {
            if (qtd_balas != 0) {
                qtd_balas --;
                System.out.println("POW!");
            }
            else{
                String resp;
                System.out.println("A munição acabou.");
                System.out.println("deseja recarregar? s/n");
                resp = leia.next();
                if (resp == "s") {
                    
                }
            }


        }
        return qtd_balas;
    }
}
