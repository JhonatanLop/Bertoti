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

    
    public static Integer atirar(int qtd_balas) {
        String acao = "s";
        Random rand = new Random();
        while (acao == "s") {
            int atirar;
            System.out.println("Você tem " + qtd_balas + " balas\nAtirar? \n1-sim\n2-não");
            atirar = leia.nextInt();
            if (atirar == 1 && qtd_balas != 0) {
                if(rand.nextInt(11) < 3){
                    System.out.println("Arma travou!\n *engatilha*");
                    qtd_balas--;
                } else{
                qtd_balas--;
                System.out.println("POW!");
                }
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

    public static void travar() {
        
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

    public static Scanner getLeia() { return leia; }
    public static void setLeia(Scanner leia) { Arma.leia = leia; }
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
    public void setTamanho(double tamanho) { this.tamanho = tamanho; }}
