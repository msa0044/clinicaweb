package com.clinica.clinica.Controllers;

import java.net.URI;
import java.util.List;

import com.clinica.clinica.Services.PacienteService;
import com.clinica.clinica.entities.Paciente;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping(value = "/cadastrar")
    public ModelAndView cadastro() {
        ModelAndView model = new ModelAndView("paciente/formPaciente.html");
        return model;
    }

    @GetMapping(value = "/encontrar")
    public ModelAndView encontrar() {
        ModelAndView model = new ModelAndView("paciente/encontrar.html");
        return model;
    }

    @GetMapping(value = "/listar")
    public ModelAndView listar() {
        ModelAndView model = new ModelAndView("paciente/listar.html");
        return model;
    }

    @GetMapping(value = "/apagar")
    public ModelAndView apagar() {
        ModelAndView model = new ModelAndView("paciente/apagar.html");
        return model;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Paciente> getOne(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<Paciente>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping(consumes = { "application/json" })
    public ResponseEntity<Paciente> saveOne(@RequestBody Paciente entity) {
        Paciente p = service.save(entity);
        return ResponseEntity.ok().body(p);
    };

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
