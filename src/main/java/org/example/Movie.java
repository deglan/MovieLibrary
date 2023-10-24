package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @JsonProperty("title")
    private String title;

    @JsonProperty("date")
    private int date;

    @JsonProperty("director")
    private Director director;

    @JsonProperty("genre")
    private String genre;

    @JsonProperty("actors")
    private List<Actor> actors;

    @Override
    public String toString() {
        return "\nMovie{" +
                "\ntitle='" + title + '\'' +
                ", \ndate=" + date +
                ", \ndirector=" + director +
                ", \ngenre='" + genre + '\'' +
                ", \nactors=" + actors +
                '}' +"\n";
    }
}
