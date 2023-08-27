package coffe.nick.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String nomeEndereco;
    private String rua;
    private String bairro;
    private String numero;
    private String cidade;
    private String uf;
}
