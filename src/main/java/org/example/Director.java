package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Director {

    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "\nDirector{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                "\n" + '}';
    }
}
