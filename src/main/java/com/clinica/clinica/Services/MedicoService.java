package com.clinica.clinica.Services;

import java.util.List;

import com.clinica.clinica.Repositories.MedicoRepository;
import com.clinica.clinica.entities.Medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {
    
    @Autowired
    private MedicoRepository repository;

    public Medico getOne(Long id){
        return repository.getById(id);
    }

    public List<Medico> getAll(){
        return repository.findAll();
    }

    public void save(Medico entity){
        repository.save(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
