package com.mohammed.movieinfoservice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohammed.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
    
    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
        return new Movie("transformer" , "transformer");
    }
}
