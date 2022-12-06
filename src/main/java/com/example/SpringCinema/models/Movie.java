package com.example.SpringCinema.models;

public class Movie {

    // id set by sql, no need to code for any ids?
    private String title;
    private int rating;
    private int duration;

    public Movie(String title, int rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    //empty constructor
    public Movie(){}

    //getters n setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
