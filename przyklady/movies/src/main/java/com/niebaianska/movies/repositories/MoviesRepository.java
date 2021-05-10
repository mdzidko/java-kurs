package com.niebaianska.movies.repositories;

import com.niebaianska.movies.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MoviesRepository extends JpaRepository<Movie, UUID> {
    Iterable<Movie> findByDirector(String director);
}
