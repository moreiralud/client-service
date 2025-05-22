package br.com.techchallenge.client.core;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
}
