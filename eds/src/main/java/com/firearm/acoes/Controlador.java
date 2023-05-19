package com.firearm.acoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;
import com.firearm.fabricaveis.Item;
import com.firearm.fabricaveis.Municao;

public class Controlador {
    static Scanner leia = new Scanner(System.in);

    static String nome;
    static int idade;
    static Double dinheiro;
    public static List<Arma> armas = new ArrayList<Arma>();
    public static List<Carregador> carregadores = new ArrayList<Carregador>();
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

    public static void controlarPersonagem(int decisao, int armaIndex) {
        // Personagem personagem = criarPersonagem();

        // menu de utilização
        // System.out.println("\nGostaria de fazer oque?");
        // System.out.println("1 - Comprar equipamentos");
        // System.out.println("2 - Usar equipamentos");
        // int resp = leia.nextInt();

        switch (decisao) {
            case 1:
                Loja.vender();
                break;

            case 2:
                if (!Controlador.armas.isEmpty()) {
                    // lista as armas
                    
                    List<Item> equip = selecaoArmaMag(armaIndex);

                    // fazendo conversão de tipos
                    Arma arma = (Arma) equip.get(0);
                    Carregador carregador = (Carregador) equip.get(1);

                    Arma.atirar(arma, carregador);

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

    public static List<Item> selecaoArmaMag(int armaIndex) {
        List<Item> retorno = new ArrayList<Item>();
        // lista as armas
        System.out.println("Suas Armas:");
        UtilsGuns.listagemArma(armas);
        // seleciona a arma
        // int newarma = leia.nextInt() - 1;
        Arma courrentArma = armas.get(armaIndex);
        Carregador courrentMag = UtilsGuns.magCompativel(courrentArma, carregadores);
        retorno.add(courrentArma);
        retorno.add(courrentMag);

        return retorno;
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