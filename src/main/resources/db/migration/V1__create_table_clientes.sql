CREATE TABLE clientes (
    id UUID PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(20) NOT NULL UNIQUE,
    data_nascimento VARCHAR(20),
    endereco TEXT
);
