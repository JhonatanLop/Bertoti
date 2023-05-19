package com.firearm;

import org.junit.jupiter.api.Test;

import com.firearm.acoes.Controlador;
import com.firearm.acoes.Fabrica;
import com.firearm.acoes.Loja;
import com.firearm.acoes.UtilsGuns;
import com.firearm.fabricaveis.Arma;
import com.firearm.fabricaveis.Carregador;
import com.firearm.fabricaveis.Item;
import com.firearm.fabricaveis.Municao.MunicaoType;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    // teste gerador e compra de arma
    @Test
    void testeGeradorArmas() {
        Fabrica.geradorArmas();
        assertEquals(6,Fabrica.arsenalArmas.size());

        Loja.comprarArma(0,1);
        // retira arma da loja
        assertEquals(5,Fabrica.arsenalArmas.size());
        // insere arma na lista
        assertEquals(1,Controlador.armas.size());
    }

    // teste gerador e compra de mag
    @Test
    void  testeGeradorMag() {
        Fabrica.geradorMag();
        assertEquals(6,Fabrica.arsenalMag.size());

        Loja.comprarMag(0,1);
        // // retira carregador da loja
        assertEquals(5,Fabrica.arsenalMag.size());
        // // insere carregador na lista
        assertEquals(1,Controlador.carregadores.size());
    }

    @Test
    void testeAtirar(){
        Arma scarH = new Arma(
                "SCAR-H",
                "Fuzil de Assalto",
                "FN Herstal",
                "7.62x51mm NATO",
                3.72,
                800.0,
                106.0);
        
        Carregador scarHMag = new Carregador(
            "FN Herstal",
            "Preto",
            "Bifilar",
            "7.62x51mm NATO",
            20,
            20,
            MunicaoType.FULL_METAL_JACKET);
        
        Arma.atirar(scarH, scarHMag);
    }

    @Test
    void magCompativel(){
        Arma scarH = new Arma(
                "SCAR-H",
                "Fuzil de Assalto",
                "FN Herstal",
                "7.62x51mm NATO",
                3.72,
                800.0,
                106.0);
        
        List<Carregador> carregadores = new ArrayList<Carregador>();
        
        Carregador scarHMag = new Carregador(
            "FN Herstal",
            "Preto",
            "Bifilar",
            "7.62x51mm NATO",
            20,
            20,
            MunicaoType.FULL_METAL_JACKET);
        carregadores.add(scarHMag);

        Carregador glockMag = new Carregador(
                "Glock",
                "Preto",
                "Monofilar",
                "9x19mm Parabellum",
                15,
                15,
                MunicaoType.FULL_METAL_JACKET);
        carregadores.add(glockMag);

        UtilsGuns.magCompativel(scarH, carregadores);
    }
}
