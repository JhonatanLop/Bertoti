package Classes.Fabricaveis;

import java.util.Scanner;

public class Arma extends Item{
    static Scanner leia = new Scanner(System.in);

    String nome;
    String tipo;
    String marca;
    double peso;
    double alcance;
    double tamanho;
    Carregador carregador;

    public Integer atirar(int qtd_balas) {
        String acao = "s";
        while (acao == "s") {
            int atirar;
            System.out.println("Você tem " + qtd_balas + " balas\nAtirar? \n1-sim\n2-não");
            atirar = leia.nextInt();
            if (atirar == 1 && qtd_balas != 0) {
                qtd_balas--;
                System.out.println("POW!");
            }
            else {
                String resp;
                System.out.println("A munição acabou.");
                System.out.println("Deseja recarregar? s/n\n");
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
    
    public Arma () {
        System.out.println("--------Arma--------");
        System.out.println("Nome da arma:");
        nome = leia.nextLine();
        System.out.println("Tipo de arma:");
        tipo = leia.nextLine();
        System.out.println("Qual à marca:");
        marca = leia.nextLine();
        System.out.println("Qual o peso?");
        peso = leia.nextDouble();
        System.out.println("Digite o Alcance máximo");
        alcance = leia.nextDouble();
        System.out.println("Tamanho da Arma:");
        tamanho = leia.nextDouble();
    }
}
