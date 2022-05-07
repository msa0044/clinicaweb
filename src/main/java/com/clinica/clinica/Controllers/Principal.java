package com.clinica.clinica.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class Principal {
    @RequestMapping(value = "/")
    public String index(){
        return "Index";
    }
}
