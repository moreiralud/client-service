package br.com.techchallenge.client.infrastructure.mapper;

import br.com.techchallenge.client.core.Cliente;
import br.com.techchallenge.client.infrastructure.entity.ClienteEntity;

import java.util.UUID;

public class ClienteMapper {

    public static ClienteEntity toEntity(Cliente cliente) {
        return ClienteEntity.builder()
                .id(cliente.getId() != null ? UUID.fromString(cliente.getId()) : null)
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .dataNascimento(cliente.getDataNascimento())
                .endereco(cliente.getEndereco())
                .build();
    }

    public static Cliente toDomain(ClienteEntity entity) {
        return Cliente.builder()
                .id(entity.getId() != null ? entity.getId().toString() : null)
                .nome(entity.getNome())
                .cpf(entity.getCpf())
                .dataNascimento(entity.getDataNascimento())
                .endereco(entity.getEndereco())
                .build();
    }
}
