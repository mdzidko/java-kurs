package com.niebaianska.movies.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(final String s) {
        super(s);
    }
}
