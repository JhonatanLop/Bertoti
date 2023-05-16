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
            185.0
        );
        arsenalArmas.add(glock);

        Arma smithWessonShield = new Arma(
            "Smith & Wesson M&P Shield",
            "Pistola",
            "Smith & Wesson",
            "9x19mm Parabellum",
            454.0,
            25.0,
            154.0
        );
        arsenalArmas.add(smithWessonShield);

        Arma sigSauerP320 = new Arma(
            "Sig Sauer P320",
            "Pistola",
            "Sig Sauer",
            "9x19mm Parabellum",
            680.0,
            50.0,
            203.0
        );
        arsenalArmas.add(sigSauerP320);
        

        Arma coltAR15 = new Arma(
            "Colt AR-15",
            "Rifle",
            "Colt",
            ".223 Remington",
            2900.0,
            600.0,
            980.0
        );
        arsenalArmas.add(coltAR15);
        

        Arma remington870 = new Arma(
            "Remington 870",
            "Espingarda",
            "Remington",
            "12 Gauge",
            3700.0,
            50.0,
            1080.0
        );
        arsenalArmas.add(remington870);

    }

    public void gerarCarregador() {
        // scar h
        Carregador scarMag = new Carregador(
                "FN Herstal",
                "Preto",
                "Bifilar",
                "7.62x51mm NATO",
                20,
                20,
                MunicaoType.FULL_METAL_JACKET);

        

    }

    public void gerarMunicao() {
        System.out.println("Deseja gerar uma munição? (1)sim ou (2)nao?");
        int resp = leia.nextInt();
        while (resp == 1) {
            Municao newBullet = new Municao();
            arsenalBullet.add(newBullet);
            System.out.println("Deseja gerar uma nova munição? (1)sim ou (2)não?");
        }

    }

    static public List<Arma> getArsenalArmas() {
        return arsenalArmas;
    }

    static public List<Carregador> getArsenalMag() {
        return arsenalMag;
    }

    static public List<Municao> getArsenalBuller() {
        return arsenalBullet;
    }

    public Scanner getLeia() {
        return leia;
    }
}
