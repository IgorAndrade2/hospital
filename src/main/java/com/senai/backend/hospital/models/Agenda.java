package com.senai.backend.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Agenda {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="tratamento")
    private boolean tratamento;
    @Column(name="consulta")
    private boolean consulta;      
    @Column(name="custo")
    private Double custo;
    @Column(name="categoria")
    private String categoria;
    @Column(name="descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_medico")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name="id_paciente")
    private Paciente paciente;
    
    public Agenda() {
    }

    public Agenda(Integer id, boolean tratamento, boolean consulta, Double custo, String categoria, String descricao,
            Medico medico, Paciente paciente) {
        this.id = id;
        this.tratamento = tratamento;
        this.consulta = consulta;
        this.custo = custo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isTratamento() {
        return tratamento;
    }

    public void setTratamento(boolean tratamento) {
        this.tratamento = tratamento;
    }

    public boolean isConsulta() {
        return consulta;
    }

    public void setConsulta(boolean consulta) {
        this.consulta = consulta;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
    
}
