# 🧾 client-service

Microsserviço responsável pelo **gerenciamento de clientes** no sistema de pedidos do Tech Challenge — FIAP.

---

## 📦 Funcionalidades

- Cadastro de clientes (nome, CPF, data de nascimento, endereço)
- Listagem de clientes
- Busca por ID
- Exclusão de cliente
- Validação de CPF único
- Arquitetura limpa
- Docker + Docker Compose
- Flyway para versionamento de banco
- Banco PostgreSQL

---

## 🚀 Como rodar com Docker

Na raiz da pasta `infra`:

```bash
docker compose up --build
