package com.senai.backend.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Medico;
import com.senai.backend.hospital.repositories.MedicoRepository;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public Medico cadastrar(Medico medico){
        return medicoRepository.save(medico);
    }

    public Medico recuperarPorId(Integer id){
        return medicoRepository.findById(id).get();
    }

    public List<Medico> listarTodos(){
        return medicoRepository.findAll();
    }

    public Medico atualizarMedico(Integer id, Medico medico){
        Medico func = medicoRepository.findById(id).get();
        if(func != null) {
            medico.setId(func.getId());
            return medicoRepository.save(medico);
        }        
        return null;      
    }

    public boolean removerPorId(Integer id){
        Medico func = medicoRepository.findById(id).get();
        if(func != null){
            medicoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
