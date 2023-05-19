package com.firearm.fabricaveis;

import java.util.List;
import java.util.Scanner;

import com.firearm.acoes.Controlador;
import com.firearm.acoes.UtilsGuns;
import com.firearm.fabricaveis.Municao.MunicaoType;

public class Carregador extends Item{
    static Scanner leia = new Scanner(System.in); 

    String marca;
    String corTransportador;
    String tipoAlinhamento;
    String calibreCarregador;
    int capacidade;
    int qtdMunicao;
    MunicaoType tipoMunicao;

    public Integer descarregar(int qtdMunicao) {
        int resp;
        System.out.println("\nVocê tem " + qtdMunicao + " munições");
        System.out.println("Deseja esvaziar o carregador?");
        System.out.println("1 - sim");
        System.out.println("2 - não");
        resp = leia.nextInt();
        if (resp == 1) {
            System.out.println("\n Descarregando");
            while (qtdMunicao != 0) {
                System.out.println("\n*puxa o ferrolho*\n *bala cai*");
                qtdMunicao --;
            }
        }
        System.out.println("\nSeu carregador está zerado!");
        return qtdMunicao;
    }

    public Carregador(
    String marca,
    String corTransportador,
    String tipoAlinhamento,
    String calibreCarregador,
    int capacidade,
    int qtdMunicao,
    MunicaoType tipoMunicao){
        this.marca = marca;
        this.corTransportador = corTransportador;
        this.tipoAlinhamento = tipoAlinhamento;
        this.calibreCarregador = calibreCarregador;
        this.capacidade = capacidade;
        this.qtdMunicao = qtdMunicao;
        this.tipoMunicao = tipoMunicao;
    }

    public String getMarca() { return marca;}
    public void setMarca(String marca) { this.marca = marca;}
    public String getCorTransportador() { return corTransportador;}
    public void setCorTransportador(String corTransportador) { this.corTransportador = corTransportador;}
    public String getTipoAlinhamento() { return tipoAlinhamento;}
    public void setTipoAlinhamento(String tipoAlinhamento) { this.tipoAlinhamento = tipoAlinhamento;}
    public String getCalibreCarregador() { return calibreCarregador;}
    public void setCalibreCarregador(String calibreCarregador) { this.calibreCarregador = calibreCarregador;}
    public int getCapacidade() { return capacidade;}
    public void setCapacidade(int capacidade) { this.capacidade = capacidade;}
    public int getQtdMunicao() { return qtdMunicao;}
    public void setQtdMunicao(int qtdMunicao) { this.qtdMunicao = qtdMunicao;}
    public MunicaoType getTipoMunicao() { return tipoMunicao;}
    public void setTipoMunicao(MunicaoType tipoMunicao) { this.tipoMunicao = tipoMunicao;}}