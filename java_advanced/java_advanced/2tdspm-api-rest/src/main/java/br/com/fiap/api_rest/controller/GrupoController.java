package br.com.fiap.api_rest.controller;


import br.com.fiap.api_rest.model.Grupo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grupo")
public class GrupoController {
    @Autowired
    Grupo grupo;



}
