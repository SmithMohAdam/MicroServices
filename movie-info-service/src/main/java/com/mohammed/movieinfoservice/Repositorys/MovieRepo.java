package com.mohammed.movieinfoservice.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohammed.movieinfoservice.models.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie , Long> {
    
}
