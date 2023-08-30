# Projeto CaféShop

Bem-vindo ao repositório do projeto CaféShop, desenvolvido como parte da disciplina "Laboratório de Desenvolvimento de Banco de Dados III". Este projeto é um site de venda de cafés, construído usando Spring Boot para o back-end, juntamente com APIs REST.

## Tecnologias Utilizadas

- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
- ![Java](https://img.shields.io/badge/Java-11-blue)
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-13-blue)
- ![Maven](https://img.shields.io/badge/Maven-3.8.3-orange)
- ![Swagger](https://img.shields.io/badge/Swagger-2.9.2-green)

## Descrição

O projeto CaféShop é uma aplicação web que permite aos usuários visualizar uma seleção de cafés e fazer pedidos. O back-end foi desenvolvido com Spring Boot e oferece APIs REST para futura comunicação com o front-end, que será desenvolvido usando React.

Algumas das principais funcionalidades implementadas incluem:

- Cadastro de cafés e informações associadas.
- Consulta de cafés disponíveis.
- Realização de pedidos e registro no banco de dados.

## Configuração

1. Clone o repositório para o seu ambiente local.
2. Configure o arquivo `application.properties` para a conexão com o banco de dados PostgreSQL.
3. Execute a aplicação Spring Boot usando o Maven: `mvn spring-boot:run`.

## Documentação da API

A documentação da API pode ser acessada através do Swagger. Após iniciar a aplicação, acesse [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) para explorar os endpoints disponíveis e testar as operações.

## Testando as APIs

Você pode utilizar ferramentas como o [Insomnia](https://insomnia.rest/) ou [Postman](https://www.postman.com/) para testar as APIs REST disponíveis.

### Insomnia

1. Faça o download e instale o [Insomnia](https://insomnia.rest/download), se ainda não o tiver feito.
2. Abra o Insomnia e crie um novo Workspace ou projeto.
3. Clique no botão "+" para adicionar uma nova requisição.
4. Preencha os detalhes da requisição, como método HTTP, URL e parâmetros, conforme necessário.
5. Envie a requisição e visualize a resposta.

### Postman

1. Faça o download e instale o [Postman](https://www.postman.com/downloads/), caso não o tenha.
2. Abra o Postman e crie uma nova coleção.
3. Clique em "New Request" para adicionar uma nova requisição.
4. Escolha o método HTTP desejado e preencha a URL e parâmetros necessários.
5. Clique em "Send" para enviar a requisição e ver a resposta.

Lembre-se de que, como você está usando APIs REST, é importante utilizar os métodos HTTP corretos (GET, POST, PUT, DELETE) de acordo com a ação que deseja executar na API.

Certifique-se de configurar os detalhes corretos da URL, headers e parâmetros conforme documentação da API que está sendo desenvolvida.

## Próximos Passos

O desenvolvimento do projeto está em andamento. Os próximos passos incluem:

- Desenvolvimento do front-end em React.
- Implementação de autenticação e controle de acesso.
- Melhorias na modelagem do banco de dados.

## Contato

Se tiver alguma dúvida ou sugestão, entre em contato:

Seu Nome - jhooliveira.lopes@gmail.com

---

**Aviso:** Este projeto está sendo desenvolvido como parte de uma atividade acadêmica e não representa um produto finalizado ou em produção.
