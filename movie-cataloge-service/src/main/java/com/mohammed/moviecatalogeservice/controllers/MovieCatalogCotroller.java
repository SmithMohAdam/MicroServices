package com.mohammed.moviecatalogeservice.controllers;


import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohammed.moviecatalogeservice.models.CatalogItem;

@RestController()
@RequestMapping("/catalog")
public class MovieCatalogCotroller {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
            new CatalogItem("transformers" , "Action movie" , 8)
        );
    }
    
}
