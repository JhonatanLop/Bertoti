package acoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fabricaveis.Arma;
import fabricaveis.Carregador;
import fabricaveis.Municao;
import fabricaveis.Municao.MunicaoType;

public class Fabrica {

    static List<Arma> arsenalArmas = new ArrayList<>();
    static List<Carregador> arsenalMag = new ArrayList<>();
    static List<Municao> arsenalBullet = new ArrayList<>();

    Scanner leia = new Scanner(System.in);

    public void geradorArmas() {
        // scar h
        Arma scarH = new Arma(
                "SCAR-H",
                "Fuzil de Assalto",
                "FN Herstal",
                "7.62x51mm NATO",
                3.72,
                800.0,
                106.0);
        arsenalArmas.add(scarH);

        Arma glock = new Arma(
                "Glock 19",
                "Pistola",
                "Glock",
                "9x19mm Parabellum",
                870.0,
                40.0,
                185.0);
        arsenalArmas.add(glock);

        Arma smithWessonShield = new Arma(
                "Smith & Wesson M&P Shield",
                "Pistola",
                "Smith & Wesson",
                "9x19mm Parabellum",
                454.0,
                25.0,
                154.0);
        arsenalArmas.add(smithWessonShield);

        Arma sigSauerP320 = new Arma(
                "Sig Sauer P320",
                "Pistola",
                "Sig Sauer",
                "9x19mm Parabellum",
                680.0,
                50.0,
                203.0);
        arsenalArmas.add(sigSauerP320);

        Arma coltAR15 = new Arma(
                "Colt AR-15",
                "Rifle",
                "Colt",
                ".223 Remington",
                2900.0,
                600.0,
                980.0);
        arsenalArmas.add(coltAR15);

        Arma remington870 = new Arma(
                "Remington 870",
                "Espingarda",
                "Remington",
                "12 Gauge",
                3700.0,
                50.0,
                1080.0);
        arsenalArmas.add(remington870);
    }

    public void gerarCarregador() {
        // Carregador da SCAR-H
        Carregador scarHMag = new Carregador(
                "FN Herstal",
                "Preto",
                "Bifilar",
                "7.62x51mm NATO",
                20,
                20,
                MunicaoType.FULL_METAL_JACKET);
        arsenalMag.add(scarHMag);

        // Carregador da Glock 19
        Carregador glockMag = new Carregador(
                "Glock",
                "Preto",
                "Monofilar",
                "9x19mm Parabellum",
                15,
                15,
                MunicaoType.FULL_METAL_JACKET);
        arsenalMag.add(glockMag);


        // Carregador da Smith & Wesson M&P Shield
        Carregador smithWessonShieldMag = new Carregador(
                "Smith & Wesson",
                "Preto",
                "Monofilar",
                "9x19mm Parabellum",
                7,
                7,
                MunicaoType.FULL_METAL_JACKET);
        arsenalMag.add(smithWessonShieldMag);

        // Carregador da Sig Sauer P320
        Carregador sigSauerP320Mag = new Carregador(
                "Sig Sauer",
                "Preto",
                "Monofilar",
                "9x19mm Parabellum",
                17,
                17,
                MunicaoType.FULL_METAL_JACKET);
        arsenalMag.add(sigSauerP320Mag);

        // Carregador do Colt AR-15
        Carregador coltAR15Mag = new Carregador(
                "Colt",
                "Preto",
                "Bifilar",
                ".223 Remington",
                30,
                30,
                MunicaoType.FULL_METAL_JACKET);
        arsenalMag.add(coltAR15Mag);

        // Carregador do Remington 870
        Carregador remington870Mag = new Carregador(
                "Remington",
                "Preto",
                "N/A",
                "12 Gauge",
                5,
                5,
                MunicaoType.FULL_METAL_JACKET);
        arsenalMag.add(remington870Mag);
    }

    static public List<Arma> getArsenalArmas() { return arsenalArmas; }

    static public List<Carregador> getArsenalMag() { return arsenalMag; }
}
