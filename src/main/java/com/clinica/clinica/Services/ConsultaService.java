package com.clinica.clinica.Services;

import java.util.List;
import java.util.Optional;

import com.clinica.clinica.Repositories.ConsultaRepository;
import com.clinica.clinica.entities.Consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    
    @Autowired
    private ConsultaRepository repository;

    public Consulta getOne(Long id){
        Optional<Consulta> p = repository.findById(id);
        return p.get();
    }

    public List<Consulta> getAll(){
        return repository.findAll();
    }

    public void save(Consulta entity){
        repository.save(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
