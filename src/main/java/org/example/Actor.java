package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "\nActor{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                "\n" + '}';
    }
}
