package coffe.nick.api.coffee;

import coffe.nick.api.endereco.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

// anotações da JPA
@Table(name = "coffee")
@Entity(name = "Coffee")
// anotações do Lombok pra getter's e construtores
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Coffee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private double preco;

    @Embedded
    private Endereco enderecoEntrega;

    public Coffee(DadosCoffe dados){
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.enderecoEntrega = new Endereco(dados.enderecoEntrega());
    }
}
