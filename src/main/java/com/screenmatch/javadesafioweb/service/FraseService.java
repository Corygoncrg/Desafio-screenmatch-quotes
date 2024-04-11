package com.screenmatch.javadesafioweb.service;

import com.screenmatch.javadesafioweb.dtos.FraseDTO;
import com.screenmatch.javadesafioweb.models.Frase;
import com.screenmatch.javadesafioweb.repository.ScreenMatchQuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private ScreenMatchQuotesRepository repositorio;

    /**
     * Método para obter uma frase Aleatória
     * @return obterFraseAleatoria
     */
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPoster(), frase.getPersonagem());
    }
}
