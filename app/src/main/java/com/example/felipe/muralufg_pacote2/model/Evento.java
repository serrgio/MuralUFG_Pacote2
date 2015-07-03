package com.example.felipe.muralufg_pacote2.model;

import java.util.Date;

public class Evento {

    private String id;
    private String nome;
    private Date dataHoraInicio;
    private Date dataHoraFim;
    private String descricao;
    private String categoria;

    public Evento(String id, String nome, Date dataHoraInicio, Date dataHoraFim, String descricao, String categoria) {
        this.id = id;
        this.nome = nome;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
