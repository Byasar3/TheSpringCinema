package com.example.SpringCinema.controllers;

import com.example.SpringCinema.models.Movie;
import com.example.SpringCinema.models.Reply;
import com.example.SpringCinema.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value ="/movies")
public class MovieController {

//    A MovieController with the following routes:
//    GET /movies
//    GET /movies/{id}
//    POST /movies

    // @Autowired to MovieService, movieService

    @GetMapping (value =("/movies"))
    public ResponseEntity<Movi> showMovies(){
        ArrayList<String> movies = MovieService.getListOfMovies();
//        Movie movie = new Movie(movies);
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }


    @GetMapping (value =("/movies{id}"))

    @PostMapping
    public ResponseEntity<Reply> newMovie(){
        Reply reply = MovieService.startMovie();
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }
}
