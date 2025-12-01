package com.senai.backend.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Horario;
import com.senai.backend.hospital.repositories.HorarioRepository;

@Service
public class HorarioService {
    @Autowired
    private HorarioRepository horarioRepository;

    public Horario cadastrar(Horario horario){
        return horarioRepository.save(horario);
    }

    public Horario recuperarPorId(Integer id){
        return horarioRepository.findById(id).get();
    }

    public List<Horario> listarTodos(){
        return horarioRepository.findAll();
    }

    public Horario atualizarHorario(Integer id, Horario horario){
        Horario func = horarioRepository.findById(id).get();
        if(func != null) {
            horario.setId(func.getId());
            return horarioRepository.save(horario);
        }        
        return null;      
    }

    public boolean removerPorId(Integer id){
        Horario func = horarioRepository.findById(id).get();
        if(func != null){
            horarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
