package com.ormtask.repositories;

import com.ormtask.entity.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<Films,Integer> {
}
