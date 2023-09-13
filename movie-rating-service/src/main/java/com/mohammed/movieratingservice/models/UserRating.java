package com.mohammed.movieratingservice.models;

import java.util.List;

public class UserRating {

    private List<Rating> rating;

    public UserRating() {
    }

    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }

    public List<Rating> getRating() {
        return rating;
    }

    
    
}
