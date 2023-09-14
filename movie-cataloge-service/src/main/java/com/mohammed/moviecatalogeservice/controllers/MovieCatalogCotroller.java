package com.mohammed.moviecatalogeservice.controllers;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mohammed.moviecatalogeservice.models.CatalogItem;
import com.mohammed.moviecatalogeservice.models.Movie;
import com.mohammed.moviecatalogeservice.models.UserRating;

@RestController()
@RequestMapping("/catalog")
public class MovieCatalogCotroller {

    @Autowired
    private RestTemplate restTemplate;

    

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){


        UserRating userRating = restTemplate.getForObject("http://movie-rating-service/rating/user/"+userId, UserRating.class); 

       return userRating.getRating().stream().map(rate ->{

        
           Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rate.getMovie(), Movie.class);
            return new  CatalogItem(movie.getName(), userId, rate.getRate());
            
        })
        .collect(Collectors.toList());

        
    }
    
}
