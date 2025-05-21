# Client Service

Este é o microsserviço responsável pelo gerenciamento de clientes no sistema do Tech Challenge.

## 🛠 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- PostgreSQL
- Flyway
- Docker & Docker Compose
- Maven

## 📁 Estrutura do Projeto

```
client-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/techchallenge/cliente
│   │   └── resources/
│   │       ├── application.properties
│   │       └── db.migration/
│   └── test/
├── Dockerfile
├── mvnw / mvnw.cmd
├── pom.xml
└── README.md
```

## ⚙️ Como executar

### 1. Build da imagem

```bash
docker compose build client
```

### 2. Subir o serviço

```bash
docker compose up -d client
```

O serviço será iniciado na porta `8080`.

### 3. Verificar health check

```bash
curl http://localhost:8080/actuator/health
```

## 📦 Endpoints disponíveis

- `GET /clientes`: Lista todos os clientes
- `POST /clientes`: Cria um novo cliente
- (Outros endpoints podem ser adicionados conforme evolução do projeto)

## 🧪 Testes

Para executar os testes unitários:

```bash
./mvnw test
```

O relatório de cobertura pode ser gerado com:

```bash
./mvnw test jacoco:report
```

## 🚧 Status

🔧 Em desenvolvimento | ✔️ Funcional para testes básicos via Postman

## 📄 Licença

Este projeto está sob a licença MIT.
