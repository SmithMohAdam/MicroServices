package com.mohammed.movieinfoservice.controllers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohammed.movieinfoservice.models.Movie;
import com.mohammed.movieinfoservice.services.MovieServices;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @Autowired
    private MovieServices movieServices;
    
    @RequestMapping("/{movieId}" )
    public Movie getMovie(@PathVariable("movieId") Long movieId){
        return movieServices.getMovie(movieId);
    }

    @RequestMapping(value = "/add-movie"  ,method = RequestMethod.POST)
    public void addMovie(@RequestBody Movie movie){
    
        movieServices.addMovie(movie);
    }
    @RequestMapping("/movies")
    public List<Movie> getAllMovies(){
       List<Movie>  movies = movieServices.getAllMovies();
       return movies;
    }
    @RequestMapping("/delete-movie/{movieId}")
    public void deleteMovie(@PathVariable("movieId") Long movieId){

       movieServices.deleteMovie(movieId);
        
    }
   
}
