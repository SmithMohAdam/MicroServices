package com.mohammed.movieinfoservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String movieId;
    private String name;

    public Movie(){

    }
    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }
    
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMovieId() {
        return movieId;
    }
    public String getName() {
        return name;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    
}
