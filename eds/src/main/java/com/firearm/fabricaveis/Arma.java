package com.firearm.fabricaveis;

import java.util.Scanner;

import java.util.Random;

public class Arma extends Item{
    static Scanner leia = new Scanner(System.in);

    String nome;
    String tipo;
    String marca;
    String armaCalibre;
    double peso;
    double alcance;
    double tamanho;
    Carregador carregador;

    
    public static int atirar(Arma courrentArma, Carregador courrentMag) {
        // String acao = "s";
        Random rand = new Random();
        int qtdMunicao = courrentMag.getQtdMunicao();
        // while (acao == "s") {
            // int atirar;
            // System.out.println("Você tem " + qtdMunicao + " balas\nAtirar? \n1-sim\n2-não");
            // atirar = leia.nextInt();
            if (qtdMunicao != 0) {
                // trava
                if(rand.nextInt(11) < 3){
                    // System.out.println("Arma travou!\n *engatilha*");
                    qtdMunicao--;
                } 
                // else{
                //     qtdMunicao--;
                //     // atira
                //     // System.out.println("\nPOW!");
                // }
            }
            // else {
            //     int resp;
            //     System.out.println("A munição acabou.");
            //     System.out.println("Deseja recarregar?\n1 - Sim\n2 - Não");
            //     resp = leia.nextInt();
            //     if (resp == 1) {
            //         qtdMunicao = courrentMag.getQtdMunicao();
            //     }
            // }
        // }
        return qtdMunicao;
    }

    public Arma(
        String nome, 
        String tipo,
        String marca,
        String armaCalibre,
        double peso,
        double alcance,
        double tamanho) {
            this.nome = nome;
            this.tipo = tipo;
            this.marca = marca;
            this.armaCalibre = armaCalibre;
            this.peso = peso;
            this.alcance = alcance;
            this.tamanho = tamanho;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getArmaCalibre() { return armaCalibre; }
    public void setArmaCalibre(String armaCalibre) { this.armaCalibre = armaCalibre; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getAlcance() { return alcance; }
    public void setAlcance(double alcance) { this.alcance = alcance; }
    public double getTamanho() { return tamanho; }
    public void setTamanho(double tamanho) { this.tamanho = tamanho; }

    public Carregador getCarregador() { return carregador; }
    public void setCarregador(Carregador carregador) { this.carregador = carregador; }}