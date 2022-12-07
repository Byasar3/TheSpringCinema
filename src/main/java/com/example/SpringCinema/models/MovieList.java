package com.example.SpringCinema.models;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<String> movies;

    public MovieList(ArrayList<String> movies){
        this.movies = movies;
    }

    public MovieList(){

    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }
}
