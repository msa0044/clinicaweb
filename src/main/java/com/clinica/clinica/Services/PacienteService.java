package com.clinica.clinica.Services;

import java.util.List;
import java.util.Optional;

import com.clinica.clinica.Repositories.PacienteRepository;
import com.clinica.clinica.entities.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    
    @Autowired
    private PacienteRepository repository;

    public Paciente getOne(Long id){
        Optional<Paciente> p = repository.findById(id);
        return p.get();
    }

    public List<Paciente> getAll(){
        return repository.findAll();
    }

    public Paciente save(Paciente entity){
        return repository.save(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
