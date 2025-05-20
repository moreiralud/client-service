package br.com.techchallenge.client.infrastructure.repository;

import br.com.techchallenge.client.infrastructure.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity, String> {
    Optional<ClienteEntity> findByCpf(String cpf);
}
