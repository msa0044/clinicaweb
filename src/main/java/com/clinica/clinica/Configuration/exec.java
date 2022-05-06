package com.clinica.clinica.Configuration;

import com.clinica.clinica.Repositories.PacienteRepository;
import com.clinica.clinica.entities.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class exec implements CommandLineRunner {

    @Autowired
    private PacienteRepository pr;

    @Override
	public void run(String... args) throws Exception {
	Paciente p = new Paciente();
    p.setNome("Marcos");
    Paciente p1 = new Paciente();
    p1.setNome("Mateus");
    Paciente p2 = new Paciente();
    p2.setNome("Bruno");

    pr.save(p);
    pr.save(p1);
    pr.save(p2);
    }
}
