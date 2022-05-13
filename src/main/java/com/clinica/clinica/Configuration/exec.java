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
     Paciente p = new Paciente(1L, "Marcos", "CPF", 18, "rua", 215, "bairro",
      "cidade", "estado", "telefone", "email", "senha");
      pr.save(p);
      System.out.println(pr.findAll());
    }
}
