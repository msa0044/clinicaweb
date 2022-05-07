package com.clinica.clinica.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {

    @GetMapping(value = "/")	
	public String index() {
		return "index";
	}
}
