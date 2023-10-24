package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {

    WELCOME("Welcome in Movie Library"),
    MENU("Menu"),
    YEARS_BETWEEN("1. Enter two years to display movie titles released between those years"),
    RANDOM_MOVIE("2. Display all information about a random movie"),
    FIND_ACTOR("3. Enter an actor's first and last name to display movie titles they appeared in"),
    EXIT("4. EXIT"),
    RELEASED_MOVIES("Movies released:"),
    INPUT_YEARS("Enter two years (release years) separated by a space:"),
    INPUT_ACTOR("Enter an actor's first and last name:"),
    INPUT_EXIT("Program terminated."),
    INPUT_WRONG("Invalid option. Please select again."),
    JSON_PATH("C:\\Users\\jzgorzaly\\Documents\\SeniorityUpdate\\MovieLibrary\\src\\main\\resources\\movies.json");


    private final String message;
}
