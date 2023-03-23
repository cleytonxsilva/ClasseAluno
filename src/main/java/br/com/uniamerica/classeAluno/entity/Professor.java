package br.com.uniamerica.classeAluno.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "professor", schema = "public")
public class Professor {
    @Id
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome_professor",nullable = false, length = 50)
    private String nomeProfessor;
    @Getter @Setter
    @Column(name = "alunos", nullable = false)
    private List <Aluno> alunos;
}
