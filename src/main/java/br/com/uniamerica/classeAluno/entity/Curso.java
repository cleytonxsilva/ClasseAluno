package br.com.uniamerica.classeAluno.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "curso", schema = "public")
public class Curso {
    @Id
    @Getter
    @Column(name = "id_curso", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCurso;
    @Getter @Setter
    @Column(name = "nome_curso",nullable = false, length = 30)
    private String nomeCurso;
    @Getter @Setter
    @Column(name = "carga_horaria", nullable = false)
    private LocalDateTime cargaHoraria;
    @Getter @Setter
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_aluno",
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {
                            "id_curso",
                            "id_aluno"
                    }
            ),
            joinColumns = @JoinColumn(
                    name = "id_curso"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_aluno"
            )
    )
    private List<Aluno> aluno;

}
