package com.example.SpringCinema.repositories;

import com.example.SpringCinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
