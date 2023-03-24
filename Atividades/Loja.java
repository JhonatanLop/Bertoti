package Atividades;
import java.util.List;
import java.util.ArrayList;

public class Loja {
    List<Usuario> usuarios = new ArrayList<Usuario>();
    
    public boolean verificarUsuario(String email) {
        for (Usuario usuario : usuarios) { if (usuario.getEmail().equals(email)) { return false;}}
        return true;
    }

    public void cadastrarUsuário(String email) {
        if (verificarUsuario(email)) {
            usuarios.add(new Usuario());
        }
    }
}
