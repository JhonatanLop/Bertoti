package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.fabricaveis.Arma;
import Classes.fabricaveis.Carregador;
import Classes.fabricaveis.Item;
import Classes.fabricaveis.Municao;

public class Personagem {
    Scanner leia = new Scanner(System.in);
    
    String nome;
    int idade;
    Double dinheiro;
    List<Arma> armas = new ArrayList<Arma>();
    List<Carregador> carregadores = new ArrayList<Carregador>();
    List<Municao> municoes = new ArrayList<Municao>();


    public Personagem(String nome, int idade, Double dinheiro) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }

    public Personagem criarPersonagem() {
        System.out.println("Qual é seu nome?");
        nome = leia.nextLine();
        System.out.println("Digite sua idade");
        idade = leia.nextInt();
        System.out.println("Quanto vc tem de money?");
        dinheiro = leia.nextDouble();
        System.out.println("Gostaria de adquirir um equipamento?\n 1 - Sim\n 2 - Não\n");
        int resp = leia.nextInt();
        if (resp == 1) {

            // Loja.vender();
        }

        Personagem personagem = new Personagem(nome, idade, dinheiro);
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
                Item item = Loja.vender();
                switch (item.getClass()) {
                case Arma:

                break;
                }
            case 2:
                if (personagem.armas == null) {
                    System.out.println("Você não possui armas");
                    System.out.println("Gostaria de comprar uma?\n 1 - Sim\n 2 - Não");
                    int condition = leia.nextInt();
                    if (condition == 1) {
                        Loja.vender();
                    }
                }
                else {
                    // Arma.atirar(carregadores.carregador.qtd_balas);
                }
            default:
                break;
        }
    }
}
