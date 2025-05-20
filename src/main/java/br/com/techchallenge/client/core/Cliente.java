package br.com.techchallenge.client.core.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
}
