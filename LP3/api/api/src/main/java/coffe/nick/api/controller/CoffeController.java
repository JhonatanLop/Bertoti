package coffe.nick.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coffe.nick.api.coffee.Coffee;
import coffe.nick.api.coffee.CoffeeRepository;
import coffe.nick.api.coffee.DadosCoffe;

@RestController
@RequestMapping("/coffee")
public class CoffeController {

    @Autowired
    private CoffeeRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody DadosCoffe dados) {
        // repository.save(new Coffee(null,
        // dados.nome(),
        // dados.descricao(),
        // dados.preco(),
        // new Endereco(dados.enderecoEntrega().nomeEndereco(),
        //     dados.enderecoEntrega().rua(),
        //     dados.enderecoEntrega().bairro(),
        //     dados.enderecoEntrega().numero(),
        //     dados.enderecoEntrega().cidade(),
        //     dados.enderecoEntrega().uf())));

        // ou para deixar o código mais limpo, irei criar um construtor que recebe esses dados na classe Coffee e só chamar o objeto no método

        repository.save(new Coffee(dados));
    }
}
