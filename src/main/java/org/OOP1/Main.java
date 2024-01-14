package org.OOP1;

public class Main {
    public static void main(String[] args) {
        seat[1].reserveSeat(true);
        seat[3].reserveSeat(true);
        seat[4].reserveSeat(true);
        seat[5].reserveSeat(true);

        Cinema.getSeats(seat[4]).reserveSeat(false);

        for (Cinema seats: seat) {
            System.out.println(Cinema.getSeats(seats));
        }
    }

    static Cinema [] seat = {
            new Cinema(8, "V"),
            new Cinema(9, "V"),
            new Cinema(15, "V"),
            new Cinema(34, "VII"),
            new Cinema(18, "IX"),
            new Cinema(10, "XII"),
            new Cinema(10, "X"),
    };
}