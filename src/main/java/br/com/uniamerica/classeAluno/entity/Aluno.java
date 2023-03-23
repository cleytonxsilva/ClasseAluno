package br.com.uniamerica.classeAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "aluno", schema = "public")
public class Aluno {
    @Id
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome_aluno", nullable = false, length = 50)
    private String nomeAluno;
    @Getter @Setter
    @Column(name = "cpf", nullable = false, unique = true, length = 20)
    private String cpf;
    @Getter @Setter
    @Column(name = "endereco", nullable = false)
    private Endereco endereco;
}
