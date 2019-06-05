package com.ormtask.entity;

import javax.persistence.*;

@Entity
@Table(name = "film_genre", schema = "ormtest1")
public class FilmGenre {
    private int id_genre;
    private String genre;

    public FilmGenre() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genre", nullable = false, unique = true)
    public int getId_genre() {
        return id_genre;
    }

    public void setId_genre(int id_genre) {
        this.id_genre = id_genre;
    }

    @Column(name = "genre", nullable = false, length = 45)
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "FilmGenre{" +
                "id_genre=" + id_genre +
                ", genre='" + genre + '\'' +
                '}';
    }
}
