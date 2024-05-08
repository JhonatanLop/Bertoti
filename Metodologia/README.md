<h1>API 3º Semestre - Jhonatan Oliveira Lopes </h1>

Trabalho de Aprendizagem a partir de Projeto Integrador (APIs), apresentado à Faculdade de Tecnologia de São José dos Campos do curso de Banco de Dados 3º Semestre/2022.

---

<summary><a href="#o-projeto"> API 3º Semestre </a></summary>
        <ul><a href="arquitetura"> Arquitetura do projeto </a></ul>
        <ul><a href="solucao"> Sobre o projeto </a></ul>
        <ul><a href="tecnologias"> Tecnologias utilizadas </a></ul>
        <ul><a href="contribuicoes"> Contribuições pessoais </a></ul>
        <ul><a href="licoes"> Lições aprendidas </a></ul>
        <ul><a href="consideracoes"> Considerações finais </a></ul>

<h2 id="sobre-mim"> Sobre mim </h2>
<div align="center">
  <img height="260em" alig src="./src/foto.png">
  <p>Jhonatan Oliveira Lopes</p>
  <br>  
</div>

*Jovem apaixonado pela arte da programação...<br> venho de família humilde em uma cidade do interior do estado de São Paulo sem muito acesso a educação de qualidade. Mas isso não me impediu de ir atrás do meu sonho. Me formei Técnico em Informática aos 17 anos pela Etec de Jaú onde aprendi sobre programação e banco dedados que hoje é minha profissão dos sonhos.*

*Aos 18 anos me mudei para São José dos Campos para estudar Matemática no Instituto Federal. Lá fiquei por apenas um semestre, após isso decidi voltar para minha área de pertencimento e Escolhi a FATEC a conselho do meu orientado/professor e pela reputação de formar bons profissionais da área. Na Fatec escolhi o curso de Banco de Dados pelo foco em programação Back-End e desenvolvimento de Banco de Dados e APIs.*

*Atualmente estou no quarto semestre com mais da metade do curso completo com planos de me formar em 2025, cada semestre com experiências incríveis e projetos em grupo, grupo esse dos quais hoje são meus melhor. Atualmente estou no quarto semestre e tive várias experiências incríveis desenvolvendo projetos inteiros em grupo através dos trabalhos de Aprendizagem a partir de Projeto Integrador (API's) que é uma característica da fatec<br>*

<div align="center">•
        <a href="https://github.com/JhonatanLop/JhonatanLop"> Github </a> •
        <a href="www.linkedin.com/in/jhonatan-o-lopes"> Linkedin </a>•
</div>

---

<h2 id = "o-projeto"> Ferramenta para controle de Horas Extras e Sobreavisos </h2>
<h4> 3º semestre • 2022 • <a href="https://github.com/projetoKhali/api3/blob/main/README.md">Repositório Github</a><h4>
<p>Parceiro Acadêmico: <a href = "https://2rpnet.com.br/">2RP Net</a></p>

<p align="center"><img src="src/banner.png"></p>

<h3 id = "solucao"> Prévia da solução </h2>

O objetivo era fazer um sistema que fizesse o controle da jornada de trabalho do colaborador, ajudar a identificar e classificar as horas extras e sobreavisos.<br>

O sistema permite que os colaboradores registrem suas horas de entrada e saída, além de fornecer uma interface para a classificação das horas como horas extras ou sobreavisos. Ele também gera relatórios e estatísticas sobre as horas trabalhadas. <br>

Para isso, as APIs de cadastro de horas extras enviam essas horas para um central de processamento, onde as horas são dividades de acordo com as regras de negócios específicas préviamente configuradas pelo perfil Administrador. As horas já divididas e classificadas seriam então salvas no banco de dados.<br>
<br>

<h3 id = "tecnologias">Tecnologias utilizadas</h3>

#### Back-End
>* [Java 17](https://www.oracle.com/br/java/technologies/downloads/#jdk17-windows).
>* [Spring](https://spring.io/).
>* [Docker](https://www.docker.com/) com [Docker Compose](https://docs.docker.com/compose/).
>* [PostgreSQL 15](https://www.postgresql.org/) banco de dados escolhido.
<br>

#### Front-End
> * [React](https://react.dev/).
> * [Typescript](https://www.typescriptlang.org).

<h2> Contribuições Pessoais </h2>

<h3> Back-End </h3>

<details>
<summary> Criptografia </summary>
<p>desenvolvi o método para criptografia das senhas dos usuários</p>
<p>O objetivo é aumentar a segurança e a privacidade do usuário. Ao invéz de a senha ser salva diretamente no banco como ela é, ela passa por um processo de criptografia oque garente que nem o pessoal com acesso direto ao banco de dados consiga vê-la</p>
<p>Com isso também tive que fazer modificações nos métodos de login para comparação de input de senha criptografada com o hash da senha salvo no banco de dados</p>

```java
public static String encode(String input) {
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] bytes = input.getBytes();
        byte[] digest = md.digest(bytes);

        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
                sb.append(String.format("%02x", b));
        }

        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null;
    }
}
```

```java
    @PostMapping
    public User createUser(@RequestBody User user) {    
        user.setPassword(Cryptography.encode(user.getRegistration()));
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody LoginRequest loginRequest) {
        return userService.getValidatedUser(loginRequest.getEmail(), Cryptography.encode(loginRequest.getPassword()));
    }
```
</details>

<br>

<details>
    <summary> Extração de relatório </summary>
<p>A extração de relatório era um requisito do cliente. O objetivo era poder extrair em um relatório .csv dos apontamentos lançados no sistema.</p>
<p>Como "plus", também foi feito um filtro das colunas possíves de serem geradas, onde é possível excluir alguns dos dados caso fosse pertinente</p>

```java
try (PrintWriter writer = response.getWriter()) {
    CSVWriter csvWriter = new CSVWriter(writer);

    List<String> header = new ArrayList<>();

    for (int i = 0; i < headers.length; i++) { if (camposBoolean[i]) { header.add(headers[i]); }}

    csvWriter.writeNext(header.toArray(String[]::new));

    // Use a biblioteca Jackson para serializar a lista em JSON
    ObjectMapper objectMapper = new ObjectMapper();
    List<String> jsonData = new ArrayList<>();

    List<String> data = new ArrayList<>();
    for (Appointment apt : allAppointments) {
        Timestamp total = new Timestamp(apt.getEndDate().getTime() - apt.getStartDate().getTime());
        if (camposBoolean[1]) data.add(apt.getUser().getRegistration());
        if (camposBoolean[2]) data.add(apt.getUser().getName());
        if (camposBoolean[3]) data.add(apt.getStartDate().toString());
        if (camposBoolean[4]) data.add(apt.getEndDate().toString());
        if (camposBoolean[5]) data.add(total.toString());
        if (camposBoolean[6]) data.add(apt.getType().toString());
        if (camposBoolean[7]) data.add(apt.getResultCenter().getName());
        if (camposBoolean[8]) data.add(apt.getClient().getName());
        if (camposBoolean[9]) data.add(apt.getProject().getName());
        if (camposBoolean[10]) data.add(apt.getJustification());

        csvWriter.writeNext(data.toArray(new String[0]));
    }

    csvWriter.close();
}
```
</details>

<br>

<details>
    <summary> Controller de Projeto</summary>
<p>O Projeto é um dos dados a ser inseridos no apontamento. Para a seleção de um projeto na hora do lançamento de um apontamento é necessário que ele esteja cadastrado no banco de dados.</p>
<p>Para isso foi necessário criar os endpoints para fazer a manipulação dos projetos. Cadastrar, excluir, editar e visualizar</p>

```java
@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    @GetMapping()
    public List<Project> getAllProjects(){
        return projectRepository.findAllActiveProjects();
    }
}
```

</details>

<h2> Lições Aprendidas </h2>

<p>Como foi minha primeira vez sendo PO e trabalhando com APIs foi muito desafiador na hora de criar as tarefas e entender realmente oque deveria ser feito e como deveria ser feito. O desenvolvimento de APIs pra </p>
<p>
Tive meu primeiro contato com Spring boot e no desenvolvimento de APIs e pude aprimorar minhas habilidades de DBA na modelagem do banco de dados inteiro.
</p>