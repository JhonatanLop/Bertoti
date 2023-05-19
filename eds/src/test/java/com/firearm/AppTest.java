package com.firearm;

import org.junit.jupiter.api.Test;

import com.firearm.acoes.Controlador;
import com.firearm.acoes.Fabrica;
import com.firearm.acoes.Loja;
import com.firearm.fabricaveis.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        // assertEquals(1, 1);

        // teste de compra -----------------------------------------//
        // cria lista de armas e carregadores
        Fabrica.geradorArmas();
        Fabrica.geradorMag();
        assertEquals(6,Fabrica.arsenalArmas.size());
        assertEquals(6,Fabrica.arsenalMag.size());

        // compra a primeira arma da lista
        Loja.comprarArma(0,1);
        // retira arma da loja
        assertEquals(5,Fabrica.arsenalArmas.size());
        // insere arma na lista
        assertEquals(1,Controlador.armas.size());

        // compra carregador
        Loja.comprarMag(0,1);
        // retira carregador da loja
        assertEquals(5,Fabrica.arsenalMag.size());
        // insere carregador na lista
        assertEquals(1,Controlador.carregadores.size());
        //----------------------------------------------------------//

        // teste para selecionar carregador compatível com arma da lista de carregadores
        List<Item> equip = Controlador.selecaoArmaMag(0);
        assertEquals(2,equip.size());

        // verifica se o carregador é compativel com a arma
        assertEquals(equip.get(0).getArmaCalibre(), equip.get(1).getCalibreCarregador());
    }
}
