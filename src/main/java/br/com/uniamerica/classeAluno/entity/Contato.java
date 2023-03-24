package br.com.uniamerica.classeAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contato", schema = "public")
public class Contato {
    @Id
    @Getter
    @Column(name = "id_contato", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContato;
    @Getter @Setter
    @Column(name = "tipo_contato", nullable = false, length = 25)
    private String tipoContato;
    @Getter @Setter
    @Column(name = "valor", nullable = false, unique = true, length = 50)
    private String valor;
    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno")
    private Aluno aluno;
}
