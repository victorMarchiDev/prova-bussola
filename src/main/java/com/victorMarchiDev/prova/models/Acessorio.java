package com.victorMarchiDev.prova.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_acessorios")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Acessorio() {}

    public Acessorio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
