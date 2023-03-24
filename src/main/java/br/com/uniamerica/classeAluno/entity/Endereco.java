package br.com.uniamerica.classeAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "endereco", schema = "public")
public class Endereco {
    @Id
    @Getter
    @Column(name = "id_endereco", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEndereco;
    @Getter @Setter
    @Column(name = "rua", nullable = false, length = 50)
    private String rua;
    @Getter @Setter
    @Column(name = "numero", nullable = false, unique = true)
    private int numero;
    @Getter @Setter
    @Column(name = "bairro", nullable = false, length = 50)
    private String bairro;
    @Getter @Setter
    @Column(name = "cep", nullable = false, unique = true, length = 10)
    private String cep;

}
