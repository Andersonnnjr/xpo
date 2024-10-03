package com.example.xpomusic.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String artista;
    private String genero;

    @OneToMany(mappedBy = "musica")
    private List<HistoricoReproducao> historicoReproducao;

    @OneToMany(mappedBy = "musica")
    private List<Recomendacao> recomendacoes;

    // Getters e Setters
}
