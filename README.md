# Repositório da API de Alunos em Java e Spring Boot

## Descrição

Este repositório contém uma API desenvolvida em Java usando o framework Spring Boot. A API gerencia informações de alunos e armazena esses dados em um banco de dados MySQL. Além disso, utiliza o Swagger para documentação e teste da API de forma interativa.

## Funcionalidades

- **Cadastro de Alunos:** Adição de novos alunos com informações como nome, idade e curso.
- **Consulta de Alunos:** Recuperação de informações sobre alunos existentes.
- **Atualização de Alunos:** Modificação dos dados de um aluno específico.
- **Remoção de Alunos:** Exclusão de registros de alunos do sistema.

## Tecnologias Utilizadas

- Java  
- Spring Boot
- MySQL
- Swagger

## Pré-requisitos

1. Java JDK (versão 17.0.8 ou superior)
2. Spring Boot
3. MySQL
4. Docker (opcional, para execução do MySQL em container)
5. IDE (IntelliJ IDEA, Eclipse, etc.)

## Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `alunosdb`.
2. Atualize as configurações de banco de dados no arquivo `application.properties` no diretório `src/main/resources`.

## Execução da Aplicação

1. Clone o repositório: `git clone https://github.com/jeniferplacido/API-Alunos.git`
2. Abra o projeto na sua IDE de escolha.
3. Execute a classe principal `Application.java`.

## Documentação da API com Swagger

A documentação interativa da API pode ser acessada em:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Exemplos de Requisições

### Obter todos os alunos

```GET /alunos```

### Obter aluno por ID

```GET alunos/{id}```

### Cadastrar alunos

```POST /alunos```

### Atualizar um aluno existente

```PUT /api/alunos/{id}```

### Remover um aluno

```DELETE /api/alunos/{id}```


## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença
Este projeto está licenciado sob a [Licença MIT](LICENSE).




