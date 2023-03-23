package br.com.uniamerica.classeAluno.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contato", schema = "public")
public class Contato {
    @Id
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "tipo_contato", nullable = false, length = 25)
    private String tipoContato;
    @Getter @Setter
    @Column(name = "valor", nullable = false, unique = true, length = 50)
    private String valor;
    @Getter @Setter
    @Column(name = "aluno", nullable = false)
    private Aluno aluno;
}
