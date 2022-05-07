package com.clinica.clinica.Controllers;

import java.net.URI;
import java.util.List;

import com.clinica.clinica.Services.MedicoService;
import com.clinica.clinica.entities.Medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/medico")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Medico> getOne(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getOne(id));
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<Medico>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @PostMapping()
    public ResponseEntity<Void> saveOne(@RequestBody Medico entity) {
            service.save(entity);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId())
                    .toUri();
            return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
