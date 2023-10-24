package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessage {

    EMPTY_LIBRARY("MovieLibrary cannot be null"),
    EMPTY_ACTOR("Actor name cannot be empty"),
    MOVIE_NOT_FOUND_YEARS("No movies found for the specified years."),
    ACTOR_NOT_FOUND("Actor not found"),
    WRONG_DATE("Date from is after Date to"),
    WRONG_JSON_READ("Error while reading data from the JSON file: ");

    private final String message;
}
