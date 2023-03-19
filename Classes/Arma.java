package Classes;

import java.util.Scanner;

public class Arma {
    static Scanner leia = new Scanner(System.in);

    String tipo;
    String marca;
    double peso;
    double alcance;
    double tamanho;
    Carregador carregador;

    public static Integer atirar(int qtd_balas) {
        String acao = "s";
        while (acao == "s") {
            int atirar;
            System.out.println("Você tem " + qtd_balas + " balas\nAtirar? \n1-sim\n2-não");
            atirar = leia.nextInt();
            if (atirar == 1 && qtd_balas != 0) {
                qtd_balas--;
                System.out.println("POW!");
            } else {
                String resp;
                System.out.println("A munição acabou.");
                System.out.println("Deseja recarregar? s/n");
                resp = leia.next();
                if (resp == "s") {
                    // chamar metodo de recarregar
                }
                else{
                    break;
                }
            }
        }
        return qtd_balas;
    }

    public static void main(String[] args) {
        // usar como parâmetro um objeto da classe Carregador
        // atirar(newMag.qtd_municao);
    }
}
