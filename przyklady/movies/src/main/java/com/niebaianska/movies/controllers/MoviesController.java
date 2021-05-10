package com.niebaianska.movies.controllers;

import com.niebaianska.movies.entities.Movie;
import com.niebaianska.movies.services.MoviesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.UUID;


@RestController
@RequestMapping("/movies")
@Slf4j
class MoviesController {

    private final MoviesService moviesService;

    MoviesController(final MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping
    Iterable<Movie> getAllMovies(){
        return moviesService.getAll();
    }

    @GetMapping("/filter")
    Iterable<Movie> getAllMoviesByDirector(@PathParam("director") String director){
        return moviesService.getAllByDirector(director);
    }


    @PostMapping
    Movie addMovie(@RequestBody Movie movie){
        return moviesService.add(movie);
    }

    @DeleteMapping("/{id}")
    void deleteMovie(@PathVariable("id") String id){
        moviesService.delete(UUID.fromString(id));
    }
}
