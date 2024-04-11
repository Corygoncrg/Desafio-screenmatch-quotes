package com.screenmatch.javadesafioweb.controller;

import com.screenmatch.javadesafioweb.dtos.FraseDTO;
import com.screenmatch.javadesafioweb.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }
}
