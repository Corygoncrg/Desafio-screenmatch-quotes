package com.screenmatch.javadesafioweb.repository;

import com.screenmatch.javadesafioweb.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScreenMatchQuotesRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase buscarFraseAleatoria();
}
