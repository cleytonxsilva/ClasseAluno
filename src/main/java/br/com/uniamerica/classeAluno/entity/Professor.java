package br.com.uniamerica.classeAluno.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "professor", schema = "public")
public class Professor {
    @Id
    @Getter
    @Column(name = "id_professor", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProfessor;
    @Getter @Setter
    @Column(name = "nome_professor",nullable = false, length = 50)
    private String nomeProfessor;
    @Getter @Setter
    @Column(name = "alunos", nullable = false)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "professor_aluno",
            uniqueConstraints = @UniqueConstraint(
                columnNames = {
                        "id_professor",
                        "id_aluno"
                }
                ),
                joinColumns = @JoinColumn(
                        name = "id_professor"
                ),
                inverseJoinColumns = @JoinColumn(
                        name = "id_aluno"
                )
    )
    private List <Aluno> alunos;
}
