package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibraryService {

    MovieLibraryValidation movieLibraryValidation = new MovieLibraryValidation();

    public void displayMoviesBetweenYears(MovieLibrary movieLibrary, int year1, int year2) {
        List<Movie> movies = movieLibrary.getMovies();
        List<String> foundMovies = movies.stream()
                .filter(movie -> movie.getDate() >= year1 && movie.getDate() <= year2)
                .map(movie -> "Title: " + movie.getTitle())
                .toList();
        movieLibraryValidation.displayMoviesBetweenYearsValidation(foundMovies, year1, year2);
    }

     public void displayRandomMovieDetails(MovieLibrary movieLibrary) {
        List<Movie> movies = movieLibrary.getMovies();
        int randomIndex = new Random().nextInt(movies.size());
        Movie randomMovie = movies.get(randomIndex);
        System.out.println("Title: " + randomMovie.getTitle());
        System.out.println("Director: " + randomMovie.getDirector().getFullName());
        System.out.println("Genre: " + randomMovie.getGenre());
        System.out.println("Release Year: " + randomMovie.getDate());
        System.out.print("Actors: ");
        String actorsList = randomMovie.getActors().stream()
                .map(Actor::getFullName)
                .collect(Collectors.joining(", "));
        System.out.println(actorsList);
    }

    public void displayMoviesByActor(MovieLibrary movieLibrary, String actorName) {
        List<Movie> movies = movieLibrary.getMovies();
        List<String> actors = movies.stream()
                .filter(movie -> movie.getActors().stream()
                        .anyMatch(actor -> actor.getFullName().equalsIgnoreCase(actorName)))
                .map(movie -> "Title: " + movie.getTitle())
                .toList();
        movieLibraryValidation.displayMoviesByActor(actors, actorName);
    }
}
