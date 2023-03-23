package br.com.uniamerica.classeAluno.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "curso", schema = "public")
public class Curso {
    @Id
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome_curso",nullable = false, length = 30)
    private String nomeCurso;
    @Getter @Setter
    @Column(name = "carga_horaria", nullable = false)
    private LocalDateTime cargaHoraria;
    @Getter @Setter
    @Column(name = "aluno", nullable = false)
    private List<Aluno> aluno;


}
