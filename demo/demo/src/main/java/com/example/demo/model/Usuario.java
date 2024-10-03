package com.example.xpomusic.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "usuario")
    private List<HistoricoReproducao> historicoReproducao;

    @OneToMany(mappedBy = "usuario")
    private List<Preferencias> preferencias;

    @OneToMany(mappedBy = "usuario")
    private List<Recomendacao> recomendacoes;

    // Getters e Setters
}
