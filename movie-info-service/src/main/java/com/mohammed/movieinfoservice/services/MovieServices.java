package com.mohammed.movieinfoservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohammed.movieinfoservice.Repositorys.MovieRepo;
import com.mohammed.movieinfoservice.models.Movie;

@Service
public class MovieServices {

    @Autowired
    private MovieRepo movieRepo;

    public void addMovie(Movie movie){
        Optional<Movie> mov = movieRepo.findById(movie.getId());
        if(!mov.isPresent()){
            movieRepo.save(movie);
        }
    }

    public Movie getMovie(Long id){
        Optional<Movie> mov = movieRepo.findById(id);
        if(!mov.isPresent()){
            return null;
        }else{
            return mov.get();
        }
        
    }

    public List<Movie> getAllMovies(){
       return movieRepo.findAll();
        
    }

    public void deleteMovie(Long id){
        Optional<Movie> mov = movieRepo.findById(id);
        if(mov.isPresent()){
           movieRepo.delete(mov.get());
        }
        
    }

    
}
