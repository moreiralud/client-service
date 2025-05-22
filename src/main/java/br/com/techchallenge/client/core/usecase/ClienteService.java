package br.com.techchallenge.client.core.usecase;

import br.com.techchallenge.client.core.Cliente;
import br.com.techchallenge.client.infrastructure.entity.ClienteEntity;
import br.com.techchallenge.client.infrastructure.mapper.ClienteMapper;
import br.com.techchallenge.client.infrastructure.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        repository.findByCpf(cliente.getCpf())
                .ifPresent(c -> { throw new RuntimeException("CPF já cadastrado"); });

        ClienteEntity saved = repository.save(ClienteMapper.toEntity(cliente));
        return ClienteMapper.toDomain(saved);
    }

    public List<Cliente> listar() {
        return repository.findAll().stream()
                .map(ClienteMapper::toDomain)
                .collect(Collectors.toList());
    }

    public Cliente buscarPorId(String id) {
        return repository.findById(String.valueOf(UUID.fromString(id)))
                .map(ClienteMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public void deletar(String id) {
        repository.deleteById(String.valueOf(UUID.fromString(id)));
    }
}
