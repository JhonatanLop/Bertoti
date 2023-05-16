package com.firearm;

import com.firearm.acoes.Fabrica;
import com.firearm.acoes.Controlador;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // gera armas e carregadores
        Fabrica.geradorArmas();
        Fabrica.gerarCarregador();

        Controlador.controlarPersonagem();
    }
}
