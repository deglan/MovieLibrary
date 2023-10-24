package org.example;

import java.util.List;

public class MovieLibraryValidation {

    public void validateMovieLibrary(MovieLibrary movieLibrary) {
        if (movieLibrary == null) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_LIBRARY.getMessage());
        }
    }

    public void displayMoviesBetweenYearsValidation(List<String> movies, int year1, int year2) {
        if (year1 > year2) {
            System.out.println(ErrorMessage.WRONG_DATE.getMessage());
        } else if (movies.isEmpty()) {
            System.out.println(ErrorMessage.MOVIE_NOT_FOUND_YEARS.getMessage());
        } else {
            System.out.println(Message.RELEASED_MOVIES);
            movies.forEach(System.out::println);
        }
    }

    public void displayMoviesByActor(List<String> actors, String actorName) {
        if (actorName == null || actorName.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_ACTOR.getMessage());
        } else if (actors.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.ACTOR_NOT_FOUND.getMessage());
        } else {
            actors.forEach(System.out::println);
        }
    }
}
