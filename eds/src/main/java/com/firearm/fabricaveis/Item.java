package com.firearm.fabricaveis;

import java.util.List;

import com.firearm.fabricaveis.Municao.MunicaoType;

public class Item {
    // arma
    String nome;
    String tipo;
    String marcaArma;
    String armaCalibre;
    double peso;
    double alcance;
    double tamanho;
    // carregador
    String marcaCarregador;
    String corTransportador;
    String tipoAlinhamento;
    String calibreCarregador;
    int capacidade;
    int qtdMunicao;
    MunicaoType tipoMunicao;

    public void usarEquipamento(List<Arma> armas, List<Carregador> carregadors) {
        
    }

    // arma
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarcaArma() { return marcaArma; }
    public void setMarcaArma(String marcaArma) { this.marcaArma = marcaArma; }
    public String getArmaCalibre() { return armaCalibre; }
    public void setArmaCalibre(String armaCalibre) { this.armaCalibre = armaCalibre; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getAlcance() { return alcance; }
    public void setAlcance(double alcance) { this.alcance = alcance; }
    public double getTamanho() { return tamanho; }
    public void setTamanho(double tamanho) { this.tamanho = tamanho; }

    // carregador
    public String getMarcaCarregador() { return marcaCarregador;}
    public void setMarcaCarregador(String marca) { this.marcaCarregador = marcaCarregador;}
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