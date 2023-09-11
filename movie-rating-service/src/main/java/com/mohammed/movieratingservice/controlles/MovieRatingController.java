package com.mohammed.movieratingservice.controlles;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohammed.movieratingservice.models.Rating;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {
    @RequestMapping("/{movieID}")
    public Rating getRating(@PathVariable("movieID") String movieId){
        return new Rating(movieId, 9);
    }
    
}
