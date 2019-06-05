package com.ormtask.service;

import com.ormtask.entity.Films;
import com.ormtask.repositories.FilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;


@Service
public class FilmService {

    @Autowired
    private FilmsRepository filmsRepository;

    public List<Films> getAll(){
        return filmsRepository.findAll();
    }
}
