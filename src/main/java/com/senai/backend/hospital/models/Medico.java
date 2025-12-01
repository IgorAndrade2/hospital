package com.senai.backend.hospital.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="medico")
public class Medico {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nome")
    private String nome;
    @Column(name="competencia")
    private String competencia;
    @Column(name="cim")
    private String cim;
    @Column(name="endereco")
    private String endereco;
    @Column(name="contato")
    private String contato;
    @ManyToOne
    @JoinColumn(name="id_horario")
    private List<Horario> horarios;
    // @ManyToMany
    // @JoinTable(
    //     name="agenda",
    //     joinColumns=@JoinColumn(name="id_paciente", referencedColumnName="id"),
    //     inverseJoinColumns=@JoinColumn(name="id_medico", referencedColumnName="id")
    // )
    // private List<Paciente> pacientes;
    public Medico() {
    }
    public Medico(Integer id, String nome, String competencia, String cim, String endereco, String contato,
            List<Horario> horarios, List<Paciente> pacientes) {
        this.id = id;
        this.nome = nome;
        this.competencia = competencia;
        this.cim = cim;
        this.endereco = endereco;
        this.contato = contato;
        this.horarios = horarios;
        //this.pacientes = pacientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
    
    // public List<Paciente> getPacientes() {
    //     return pacientes;
    // }
    // public void setPacientes(List<Paciente> pacientes) {
    //     this.pacientes = pacientes;
    // }    
}
