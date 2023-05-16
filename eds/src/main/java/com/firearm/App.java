import acoes.Fabrica;
import acoes.Personagem;

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
        Fabrica.getArsenalArmas();
        Fabrica.getArsenalMag();

        Personagem personagem = new Personagem("jhow",19,500.0);
        Personagem.controlarPersonagem(personagem);
    }
}
