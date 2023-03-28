package com.smith.moviecatalogservice.resources;

//import com.smith.contrib.javanica.annotation.HystrixCommand;
import com.smith.moviecatalogservice.models.CatalogItem;
import com.smith.moviecatalogservice.models.Movie;
import com.smith.moviecatalogservice.models.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@RestController
@RequestMapping("/catalog")
public class MovieCatelogResource {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder wBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        CatalogItem ret =new CatalogItem() ;
        List<CatalogItem> catList =new ArrayList<>();
        
        List<Rating> ratings = Arrays.asList(
            new Rating( "123" ,9),
            new Rating("124" ,5)
        );

        for(Rating rating : ratings){
           // Movie movie =restTemplate.getForObject( "http://localhost:8082/movies/"+rating.getMovieId() , Movie.class);
            Movie movie = wBuilder.build()
                    .get()
                    .uri("http://localhost:8082/movies/"+rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();
            ret.setName(movie.getMovieId());
            ret.setRating(rating.getRating());
           // ret.setDesc(movie.toString());
            catList.add(ret);
        }

        return catList;
        // ratings.stream().map( (Function<? super Rating, ? extends R>) rating -> {
        //     new CatalogItem(rating.getMovieId(), rating.getMovieId(), 0)
        // })
        //.collect(Collectors.toList());
        // get all rated movie IDs
        // return Arrays.asList(
        //     new CatalogItem(userId,"Some Things",0)
        // );
    
    }

    
}
