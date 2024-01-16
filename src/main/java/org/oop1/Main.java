package org.oop1;

public class Main {
    public static void main(String[] args) {
        seat[1].reserveSeat(true);
        seat[3].reserveSeat(true);
        seat[4].reserveSeat(true);
        seat[5].reserveSeat(true);

        seat[4].reserveSeat(false);

        for (CinemaSeat seats: seat) {
            System.out.println(seats);
        }
    }

    private static CinemaSeat[] seat = {
            new CinemaSeat(8, "V"),
            new CinemaSeat(9, "V"),
            new CinemaSeat(15, "V"),
            new CinemaSeat(34, "VII"),
            new CinemaSeat(18, "IX"),
            new CinemaSeat(10, "XII"),
            new CinemaSeat(10, "X"),
    };
}