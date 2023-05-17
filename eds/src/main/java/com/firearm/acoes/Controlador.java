package com.firearm.acoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;
import com.firearm.fabricaveis.Municao;

public class Controlador {
    static Scanner leia = new Scanner(System.in);

    static String nome;
    static int idade;
    static Double dinheiro;
    static List<Arma> armas = new ArrayList<Arma>();
    static List<Carregador> carregadores = new ArrayList<Carregador>();
    static List<Municao> municoes = new ArrayList<Municao>();

    public Controlador(
            String nome,
            int idade,
            Double dinheiro,
            List<Arma> armas,
            List<Carregador> carregadores,
            List<Municao> municoes) {
        Controlador.nome = nome;
        Controlador.idade = idade;
        Controlador.dinheiro = dinheiro;
    }

    public static void controlarPersonagem() {
        // Personagem personagem = criarPersonagem();

        // menu de utilização
        System.out.println("\nGostaria de fazer oque?");
        System.out.println("1 - Comprar equipamentos");
        System.out.println("2 - Usar equipamentos");
        int resp = leia.nextInt();

        switch (resp) {
            case 1:
                Loja.vender();
                // // vai até a loja e retorna um item
                // List<Item> item = Loja.vender();
                // // verifica o tipo do item
                // switch (item.getClass().getName()) {
                // // caso o item comprado seja do tipo Arma:
                // case "Arma":
                // // realiza um cast (conversão de tipo) do objeto Item, para Arma

                // Arma armaComprada = (Arma) item;
                // // adiciona uma nova arma no arsenal
                // armas.add(armaComprada);
                // break;
                // // caso o item comprado seja do tipo Carregador:
                // case "Carregador":
                // // converte tipo para Carregador
                // Carregador newMag = (Carregador) item;
                // // adiciona carregador no arsenal
                // carregadores.add(newMag);
                // break;
                // // caso o item comprado seja do tipo Munição:
                // case "Municao":
                // // conversão de tipo
                // Municao newBullet = (Municao) item;
                // // adiciona munição no arsenal
                // municoes.add(newBullet);
                break;

            case 2:
                if (!Controlador.armas.isEmpty()) {
                    // seleciona a arma a ser usada
                    System.out.println("Suas Armas:");
                    int i = 1;
                    for (Arma arma : armas) {
                        System.out.println(i + " = " + arma.getNome());
                    }
                    int newarma = leia.nextInt() - 1;
                    Arma courrentArma = armas.get(newarma);
                    // verifica se tem um carregador disponível dessa arma
                    Carregador courrentCarregador = carregadores
                            .get(UtilsGuns.magCompativel(courrentArma, carregadores));
                    Arma.atirar(courrentCarregador.getQtdMunicao());
                } else {
                    System.out.println("Você não possui armas\nGostaria de comprar uma?\n1 - Sim\n2 - Não");
                    int condition = leia.nextInt();
                    if (condition == 1) {
                        Loja.vender();
                    }
                }

            default:
                break;
        }
    }

    public static String getNome() { return nome; }

    public static int getIdade() { return idade; }

    public static Double getDinheiro() { return dinheiro; }

    public static List<Arma> getArmas() { return armas; }

    public static List<Carregador> getCarregadores() { return carregadores; }

    public static List<Municao> getMunicoes() { return municoes; }

    public static void setNome(String nome) { Controlador.nome = nome; }

    public static void setIdade(int idade) { Controlador.idade = idade; }

    public static void setDinheiro(Double dinheiro) { Controlador.dinheiro = dinheiro; }

    public static void setArmas(List<Arma> armas) { Controlador.armas = armas; }

    public static void setCarregadores(List<Carregador> carregadores) { Controlador.carregadores = carregadores; }

    public static void setMunicoes(List<Municao> municoes) { Controlador.municoes = municoes; }
}