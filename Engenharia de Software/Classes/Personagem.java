package Classes;

import java.util.Scanner;

public class Personagem {
    Scanner leia = new Scanner(System.in);
    
    String nome;
    int idade;
    Double dinheiro;
    Arma arma;

    public Personagem(String nome, int idade, Double dinheiro, Arma arma) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
        this.arma = arma;
    }

    public Personagem criarPersonagem() {
        System.out.println("Qual é seu nome?");
        nome = leia.nextLine();
        System.out.println("Digite sua idade");
        idade = leia.nextInt();
        System.out.println("Quanto vc tem de money?");
        dinheiro = leia.nextDouble();
        arma = null;

        Personagem personagem = new Personagem(nome, idade, dinheiro, arma);
        return personagem;
    }

    public void controlarPersonagem() {
        Personagem personagem = criarPersonagem();
        
        System.out.println("Gostaria de fazer oque?");
        System.out.println("1 - Comprar equipamentos");
        System.out.println("2 - Usar equipamentos");
        int resp = leia.nextInt();

        switch (resp) {
            case 1:
                Loja.vender();
                break;
            case 2:
                if (personagem.arma == null) {
                    
                }
            default:
                break;
        }
    }
}
