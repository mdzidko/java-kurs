package com.niebaianska.movies.services;

import com.niebaianska.movies.entities.Movie;

import java.util.UUID;

public interface MoviesService {
    Iterable<Movie> getAll();
    Movie add(Movie movie);
    void delete(UUID id);
    Iterable<Movie> getAllByDirector(String director);
}
