# Bertoti
> Engenharia de Software

## Definição de Engenharia de Software
Engenharia de software é a área profissional responsável pela criação, manutenção e desenvolvimento de sistemas.<br>
Os profissionais da área atuam na realização de análises, coletas e processamento de dados, identificando falhas<br>
e desvios na operação destes produtos, para, a partir daí, otimizar sua performance.<br>

### <u>Tema da atividade individual:</u>
Armas de fogo!

## <u>Casos de uso</u>
As classes descrevem detalhes de uma arma de fogo, seus métodos descrevem seus funcionamentos.<br>
Uma arma de fogo pode ser usada como uma ferramenta para autodefesa ou prática esportiva<br>
> Atualmente, o Estatuto do Desarmamento (Lei 10.826/03) proíbe a venda de arma de fogo ao cidadão comum com menos de 25 anos de idade.

<details>
<summary> Casos de uso </summary>

![casos de uso](https://github.com/JhonatanLop/Bertoti/assets/111443621/9ee14346-f11a-49e3-babc-b49a587d35cd)

</details>

<details>
<summary> Diagrama UML da atividade </summary>
<br>
  
![Bertoti](https://github.com/JhonatanLop/Bertoti/assets/111443621/9b8eb1f0-d562-473f-92db-5f53361faf4b)

</details>

## Trade-off
Trade-off, ou troca, é um conceito utilizado para descrever a situação em que você precisa fazer uma escolha entre duas ou mais opções que têm vantagens e desvantagens distintas. Quando você opta por uma dessas opções, está abrindo mão dos benefícios oferecidos pelas outras opções disponíveis.<br>
<br>
Um exemplo de Trade-off entre desenvolvimento em cascata e desenvolvimento ágil:<br>
<br>
Ao escolher o modelo em cascata, você pode obter uma estrutura e documentação mais rigorosas, mas pode enfrentar dificuldades se houver mudanças de requisitos ou feedback do cliente durante o processo. Por outro lado, ao optar pelo modelo ágil, você pode ser mais flexível em relação a mudanças e feedback, mas pode enfrentar desafios na gestão do processo e garantia de qualidade, especialmente em projetos complexos ou com requisitos rígidos.


-----------

# Todo - atividade
> ultima atualização: 01/12/2023

## Oque é?
é uma aplicação java spring-boot com integração com banco de dados postgres.<br>
um lugar onde você pode organizar suas tarefas de forma rápida e os dados serão salvos em um banco de dados relacional

## Ferramentas utilizadas
[Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[spring-boot 3.2.0](https://start.spring.io/)
[postgres 15](https://www.postgresql.org/download/)

## Como rodar?
> certifique-se de ter o postgres instalado
1. clone o repositório localmente usando o comando:
```git clone https://github.com/JhonatanLop/Bertoti.git```
2. abra o terminal na pasta de download ```Bertoti/demo```
3. altere o arquivo ```demo/src/main/resources/application.properties``` com os dados do seu banco
4. no terminal digite o comando ```mvn spring-boot:run```
5. no navegador, digite o endereço: ```http://localhost:8080```