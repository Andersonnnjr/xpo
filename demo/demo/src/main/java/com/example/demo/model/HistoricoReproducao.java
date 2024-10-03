package com.example.xpomusic.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class HistoricoReproducao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "musica_id")
    private Musica musica;

    private Date dataReproducao;

    // Getters e Setters
}
