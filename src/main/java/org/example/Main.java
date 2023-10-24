package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MovieLibraryService movieLibraryService = new MovieLibraryService();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        MovieLibrary movieLibrary = null;
        try {
            movieLibrary = objectMapper.readValue(new File(Message.JSON_PATH.getMessage()), MovieLibrary.class);
        } catch (IOException e) {
            System.err.println(ErrorMessage.WRONG_JSON_READ.getMessage() + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(Message.MENU.getMessage());
            System.out.println(Message.YEARS_BETWEEN.getMessage());
            System.out.println(Message.RANDOM_MOVIE.getMessage());
            System.out.println(Message.FIND_ACTOR.getMessage());
            System.out.println(Message.EXIT.getMessage());
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println(Message.INPUT_YEARS.getMessage());
                    int year1 = scanner.nextInt();
                    int year2 = scanner.nextInt();
                    movieLibraryService.displayMoviesBetweenYears(movieLibrary, year1, year2);
                }
                case 2 -> movieLibraryService.displayRandomMovieDetails(movieLibrary);
                case 3 -> {
                    System.out.println(Message.INPUT_ACTOR.getMessage());
                    scanner.nextLine();  // Clear the newline character
                    String actorName = scanner.nextLine();
                    movieLibraryService.displayMoviesByActor(movieLibrary, actorName);
                }
                case 4 -> {
                    System.out.println(Message.INPUT_EXIT.getMessage());
                    return;
                }
                default -> System.out.println(Message.INPUT_EXIT);
            }
        }

    }


}