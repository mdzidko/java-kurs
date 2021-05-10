package com.niebaianska.movies.entities;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@ToString
public class Movie {
    @Id
    private UUID id;
    private String title;
    private String director;
    private Date releaseDate;

    Movie() {
        this.id = UUID.randomUUID();
    }

    Movie(final String title, final String director, final Date releaseDate) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }
}
