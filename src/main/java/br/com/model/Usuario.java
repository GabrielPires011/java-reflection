package br.com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Long cpf;

    public Usuario() {
    }

    public Usuario(Long id, String nome, Long cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public Long getCpf() {
        return cpf;
    }
}
