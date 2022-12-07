package com.example.SpringCinema.services;

import com.example.SpringCinema.models.Movie;
import com.example.SpringCinema.models.Reply;
import com.example.SpringCinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {


    @Autowired
    MovieRepository movieRepository;

    private ArrayList<String> listOfMovies;

    public MovieService(){

    }


    public static ArrayList<String> getListOfMovies() {
        return listOfMovies;
    }

    public void setListOfMovies(ArrayList<String> listOfMovies) {
        this.listOfMovies = listOfMovies;
    }

    //    public Reply startMovie() {
//        Movie movie = new Movie();
//        movieRepository.save(movie);
//        return new Reply(
//        );
//    }
}
