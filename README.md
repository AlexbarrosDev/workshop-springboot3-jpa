# Projeto Spring Boot E-commerce API
![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)
![Status](https://img.shields.io/badge/Status-%20Finalizado-yellow)
![License](https://img.shields.io/badge/License-MIT-green)
## Descrição
Este projeto é uma **API REST de e-commerce** desenvolvida com **Spring Boot e JPA/Hibernate**, utilizando banco de dados **H2**.  
O objetivo é **praticar** conceitos de CRUD, associações entre entidades, injeção de dependência e tratamento de exceções personalizadas.

## Tecnologias utilizadas
- Java 21
- Spring Boot 3
- JPA / Hibernate
- H2 Database
- Maven
- IntelliJ IDEA

## Estrutura do projeto
```text
src/
├── main/java/com/praticandoweb/webservice/
│   ├── WebserviceApplication.java
│   ├── config/
│   │   └── TestConfig.java
│   ├── entities/
│   │   ├── Category.java
│   │   ├── Order.java
│   │   ├── OrderItem.java
│   │   ├── Payment.java
│   │   ├── Product.java
│   │   ├── User.java
│   │   ├── enums/OrderStatus.java
│   │   └── pk/OrderItemPK.java
│   ├── repositories/
│   │   ├── CategoryRepository.java
│   │   ├── OrderItemRepository.java
│   │   ├── OrderRepository.java
│   │   ├── ProductRepository.java
│   │   └── UserRepository.java
│   ├── resources/
│   │   ├── CategoryResources.java
│   │   ├── OrderResources.java
│   │   ├── ProductResources.java
│   │   ├── UserResources.java
│   │   └── exceptions/
│   │       ├── ResourceExceptionHandler.java
│   │       └── StandardError.java
│   └── services/
│       ├── CategoryService.java
│       ├── OrderService.java
│       ├── ProductService.java
│       ├── UserService.java
│       └── exceptions/
│           ├── DatabaseException.java
│           └── ResourcesNotFoundException.java
└── main/resources/
    ├── application.properties
    ├── application-test.properties
    ├── static/
    └── templates/
```
### Como executar o projeto
#### Requisitos
- Java 21 ou superior instalado
- IntelliJ IDEA (ou outra IDE Java)
- Maven

### Passos

### 1º passo: clonar o repositório
git clone https://github.com/AlexbarrosDev/seu-projeto-ecommerce.git

### 2º passo:
Configurar o application.properties (já pronto para H2)

### 3º passo:
Executar a classe `WebserviceApplication.java`

## Testando API
Use o `Postman` ou `Insomnia` para testar os endpoints.
Exemplo de requisição [GET /users/1](http://localhost:8080/users/1) :

```json
{
  "id": 1,
  "name": "Maria Clara",
  "email": "maria@gmail.com",
  "phone": "9979998",
  "password": "123456"
}
```
### Endpoints principais
- [GET /users](http://localhost:8080/users)
- [GET /users/{id}](http://localhost:8080/users/{id})
- [POST /users](http://localhost:8080/users)
- [PUT /users/{id}](http://localhost:8080/users/{id})
- [DELETE /users/{id}](http://localhost:8080/users/{id})
- [GET /orders](http://localhost:8080/orders)
- [GET /products](http://localhost:8080/products)
- [GET /categories](http://localhost:8080/categories)

## Funcionamento
- Resources (Controllers): expõem endpoints REST para entidades
- Services: camada de negócio e regras de validação 
- Repositories: interfaces JPA para CRUD automático
- Entities: mapeamento de tabelas com relacionamentos
- Exceptions: tratamento de erros personalizados

## Conceitos aplicados
- API REST com Spring Boot
- CRUD completo com JPA/Hibernate
- Relacionamento entre entidades (1-1, 1-N, N-N)
- Injeção de dependência e camada de serviço
- Tratamento de exceções personalizadas
- Banco H2 para testes

## Autor

**Autor:** Alex Barros
- Buri - SP
- Estudante de ADS / Desenvolvedor Back-End Java

## Contato
- GitHub: [AlexbarrosDev](https://github.com/AlexbarrosDev)
- LinkedIn: [Alex Barros](https://www.linkedin.com/in/alex-barros-dev)
- Email: alexbarros.dev@gmail.com


## Licença

Este projeto está licenciado sob a licença MIT.  
Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
