package com.ormtask.entity;


import javax.persistence.*;

@Entity
@Table(name = "films", schema = "ormtest1")
public class Films {
    private int id_films;
    private String name_films;
    private int year_films;
    private int genre_films;
    private String img_films;



    public Films() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_films", nullable = false, unique = true)
    public int getId_films() {
        return id_films;
    }

    public void setId_films(int id_films) {
        this.id_films = id_films;
    }

    @Column(name = "name_films", nullable = false, length = 45)
    public String getName_films() {
        return name_films;
    }

    public void setName_films(String name_films) {
        this.name_films = name_films;
    }

    @Column(name = "year_films", nullable = false)
    public int getYear_films() {
        return year_films;
    }

    public void setYear_films(int year_films) {
        this.year_films = year_films;
    }

    @Column(name = "genre_films", nullable = false)
    public int getGenre_films() {
        return genre_films;
    }

    public void setGenre_films(int genre_films) {
        this.genre_films = genre_films;
    }

    @Column(name = "img_films", nullable = true)
    public String getImg_films() {
        return img_films;
    }

    public void setImg_films(String img_films) {
        this.img_films = img_films;
    }

    @Override
    public String toString() {
        return "Films{" +
                "id_films=" + id_films +
                ", name_films='" + name_films + '\'' +
                ", year_films=" + year_films +
                ", genre_films=" + genre_films +
                ", img_films='" + img_films + '\'' +
                '}';
    }
}
