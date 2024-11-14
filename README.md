# CRUD de Clientes com JPA e Hibernate

Este projeto demonstra um CRUD básico (Create, Read, Update, Delete) para a entidade `Cliente` usando JPA com Hibernate para persistência de dados. Ele serve como exemplo de uma aplicação simples que mapeia uma classe Java para uma tabela no banco de dados.

## Descrição

A aplicação contém uma classe `Cliente`, mapeada para a tabela `clientes` no banco de dados. O uso de JPA e Hibernate facilita o gerenciamento das operações de persistência, permitindo que você insira, consulte, atualize e exclua dados de forma eficiente e segura.

## Requisitos

Para executar o projeto, você precisa de:
- Java Development Kit (JDK) 11 ou superior
- Dependências JPA e Hibernate configuradas no seu gerenciador de pacotes (por exemplo, Maven ou Gradle)
- Banco de dados compatível com JPA e configurado para esta aplicação

## Como Executar

1. Configure as dependências de JPA e Hibernate no projeto.
2. Certifique-se de que o banco de dados está configurado e conectado corretamente.
3. Execute a aplicação para realizar operações CRUD básicas na tabela `clientes`.

## Funcionalidades

- **Create**: Adicionar novos clientes ao banco de dados.
- **Read**: Consultar e exibir informações dos clientes.
- **Update**: Atualizar dados dos clientes existentes.
- **Delete**: Remover clientes do banco de dados.

## Configuração do Banco de Dados

As configurações de conexão com o banco de dados devem ser definidas no arquivo de configuração do projeto (como `persistence.xml` ou `application.properties`), incluindo URL do banco, credenciais e dialeto do Hibernate.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais informações.
