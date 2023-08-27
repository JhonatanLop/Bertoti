package coffe.nick.api.coffee;

import coffe.nick.api.endereco.ReEndereco;

public record DadosCoffe(String nome, String descricao, double preco, ReEndereco enderecoEntrega) {
}
