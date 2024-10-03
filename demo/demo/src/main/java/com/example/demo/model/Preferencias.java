package com.example.xpomusic.model;

import javax.persistence.*;

@Entity
public class Preferencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String generoPreferido;
    private String artistaPreferido;

    // Getters e Setters
}
