package com.ormtask.repositories;

import com.ormtask.entity.FilmGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmGenreRepository extends JpaRepository<FilmGenre,Integer> {
}
