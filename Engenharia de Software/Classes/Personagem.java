package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Fabricaveis.Arma;
import Classes.Fabricaveis.Carregador;
import Classes.Fabricaveis.Item;
import Classes.Fabricaveis.Municao;

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
        
        // menu de utilização
        System.out.println("Gostaria de fazer oque?");
        System.out.println("1 - Comprar equipamentos");
        System.out.println("2 - Usar equipamentos");
        int resp = leia.nextInt();

        switch (resp) {
            case 1:
                // vai até a loja e retorna um item
                Item item = Loja.vender();
                // verifica o tipo do item
                switch (item.getClass().getName()) {
                    // caso o item comprado seja do tipo Arma:
                    case "Arma":
                        // realiza um cast (conversão de tipo) do objeto Item, para Arma
                        Arma armaComprada = (Arma) item;
                        // adiciona uma nova arma no arsenal
                        armas.add(armaComprada);
                    break;
                    // caso o item comprado seja do tipo Carregador:
                    case "Carregador":
                        // converte tipo para Carregador
                        Carregador newMag = (Carregador) item;
                        // adiciona carregador no arsenal
                        carregadores.add(newMag);
                    break;
                    // caso o item comprado seja do tipo Munição:
                    case "Municao":
                        // conversão de tipo
                        Municao newBullet = (Municao) item;
                        // adiciona munição no arsenal
                        municoes.add(newBullet);
                    break;
                }

                // // caso o item comprado seja do tipo Arma:
                // if (item instanceof Arma) {
                    
                // } 
                // // caso o item comprado seja do tipo Carregador:
                // else if (item instanceof Carregador) {
                    
                // } 
                // // caso o item comprado seja do tipo Municao
                // else {

                // }

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
