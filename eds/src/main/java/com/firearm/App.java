package com.firearm;

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
        Personagem personagem = criarPersonagem();
        controlarPersonagem(personagem);
    }
}
