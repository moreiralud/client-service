package br.com.techchallenge.client.infrastructure.mapper;

import br.com.techchallenge.client.core.domain.Cliente;
import br.com.techchallenge.client.infrastructure.entity.ClienteEntity;

public class ClienteMapper {

    public static ClienteEntity toEntity(Cliente cliente) {
        return ClienteEntity.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .dataNascimento(cliente.getDataNascimento())
                .endereco(cliente.getEndereco())
                .build();
    }

    public static Cliente toDomain(ClienteEntity entity) {
        return Cliente.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .cpf(entity.getCpf())
                .dataNascimento(entity.getDataNascimento())
                .endereco(entity.getEndereco())
                .build();
    }
}
