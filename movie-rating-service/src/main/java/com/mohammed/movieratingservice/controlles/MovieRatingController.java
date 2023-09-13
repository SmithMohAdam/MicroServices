package com.mohammed.movieratingservice.controlles;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohammed.movieratingservice.models.Rating;
import com.mohammed.movieratingservice.models.UserRating;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {
    @RequestMapping("/{movieID}")
    public Rating getRating(@PathVariable("movieID") String movieId){
        

        return new Rating(movieId, 9);
    }
     @RequestMapping("user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
            new Rating("123",9),
            new Rating("124",10),
            new Rating("125",11),
            new Rating("126",12)
        );
        UserRating userRating = new UserRating();
        userRating.setRating(ratings);
        return userRating;
    }
    
}
