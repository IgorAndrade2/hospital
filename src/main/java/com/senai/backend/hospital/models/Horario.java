package com.senai.backend.hospital.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="horario")
public class Horario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="hora_inicio")
    private LocalDate horaInicio;
    @Column(name="hora_final")
    private LocalDate horaFinal;
    @Column(name="dia")
    private Integer dia;

    public Horario() {
    }

    public Horario(Integer id, LocalDate horaInicio, LocalDate horaFinal, Integer dia) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.dia = dia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalDate horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }  
}
