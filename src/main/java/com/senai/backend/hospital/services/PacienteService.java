package com.senai.backend.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Paciente;
import com.senai.backend.hospital.repositories.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente cadastrar(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Paciente recuperarPorId(Integer id){
        return pacienteRepository.findById(id).get();
    }

    public List<Paciente> listarTodos(){
        return pacienteRepository.findAll();
    }

    public Paciente atualizarPaciente(Integer id, Paciente paciente){
        Paciente func = pacienteRepository.findById(id).get();
        if(func != null) {
            paciente.setId(func.getId());
            return pacienteRepository.save(paciente);
        }        
        return null;      
    }

    public boolean removerPorId(Integer id){
        Paciente func = pacienteRepository.findById(id).get();
        if(func != null){
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
