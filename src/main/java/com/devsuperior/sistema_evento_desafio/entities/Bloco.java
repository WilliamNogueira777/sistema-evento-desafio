package com.devsuperior.sistema_evento_desafio.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private Instant incio;
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco() {
    }

    public Bloco(Integer id, Instant incio, Instant fim) {
        Id = id;
        this.incio = incio;
        this.fim = fim;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Instant getIncio() {
        return incio;
    }

    public void setIncio(Instant incio) {
        this.incio = incio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }
}
