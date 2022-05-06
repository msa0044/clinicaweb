package com.clinica.clinica.Services;

import java.util.List;

import com.clinica.clinica.Repositories.ConsultaRepository;
import com.clinica.clinica.entities.Consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    
    @Autowired
    private ConsultaRepository repository;

    public Consulta getOne(Long id){
        return repository.getById(id);
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
