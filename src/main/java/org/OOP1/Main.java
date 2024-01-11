package org.OOP1;

public class Main {
    public static void main(String[] args) {
        seat[1].isFree(false);
        seat[3].isFree(false);

        for (Cinema seats: seat) {
            System.out.println(seats.toString());
        }
    }


    static Cinema [] seat = {
    new Cinema(15, "V"),
    new Cinema(34, "VII"),
    new Cinema(18, "IX"),
    new Cinema(10, "XII"),
    new Cinema(10, "X"),
    };
}