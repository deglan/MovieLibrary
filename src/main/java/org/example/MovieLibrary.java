package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieLibrary {

    private List<Movie> movies;

    @Override
    public String toString() {
        return "\nMovieLibrary{" +
                "movies=" + movies +
                '}';
    }
}
