package com.mohammed.moviecatalogeservice.models;

public class Rating {

    private String movie;
    private int rate;
    public Rating(){}
    public Rating(String movie, int rate) {
        this.movie = movie;
        this.rate = rate;
    }
    public void setMovie(String movie) {
        this.movie = movie;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public String getMovie() {
        return movie;
    }
    public int getRate() {
        return rate;
    }
    
    
}
