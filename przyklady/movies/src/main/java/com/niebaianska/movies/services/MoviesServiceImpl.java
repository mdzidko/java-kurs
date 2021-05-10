package com.niebaianska.movies.services;

import com.niebaianska.movies.entities.Movie;
import com.niebaianska.movies.repositories.MoviesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
class MoviesServiceImpl implements MoviesService{
    private final MoviesRepository moviesRepository;

    MoviesServiceImpl(final MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public Iterable<Movie> getAll() {
        return moviesRepository.findAll();
    }

    @Override
    public Movie add(final Movie movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public void delete(final UUID id) {
        Movie movie = moviesRepository
                .findById(id)
                .orElseThrow(() -> new MovieNotFoundException("Movie with id " + id.toString() + " was not found"));

        moviesRepository.delete(movie);
    }

    @Override
    public Iterable<Movie> getAllByDirector(final String director) {
        return moviesRepository.findByDirector(director);
    }


}
