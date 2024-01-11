package org.OOP1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Movie movie1 = new Movie();

    movie1.setTitle("On The Line");
    movie1.setDirector("Romuald Boulanger");
    movie1.setDate(LocalDate.of(2001, 10, 23));
    movie1.setDuration(104);

    Movie movie2 = new Movie("Kac Vegas 4", "Todd Phillips", 95,
                                LocalDate.of(2023, 11, 26));


        System.out.println(movie1.toString());
        System.out.println(movie2.toString());

    }
}