package com.senai.backend.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Agenda;
import com.senai.backend.hospital.repositories.AgendaRepository;

@Service
public class AgendaService {
     @Autowired
    private AgendaRepository agendaRepository;

    public Agenda cadastrar(Agenda agenda){
        return agendaRepository.save(agenda);
    }

    public Agenda recuperarPorId(Integer id){
        return agendaRepository.findById(id).get();
    }

    public List<Agenda> listarTodos(){
        return agendaRepository.findAll();
    }

    public Agenda atualizarAgenda(Integer id, Agenda agenda){
        Agenda func = agendaRepository.findById(id).get();
        if(func != null) {
            agenda.setId(func.getId());
            return agendaRepository.save(agenda);
        }        
        return null;      
    }

    public boolean removerPorId(Integer id){
        Agenda func = agendaRepository.findById(id).get();
        if(func != null){
            agendaRepository.deleteById(id);
            return true;
        }
        return false;
    }
    //a
}
