package org.OOP1;

public class TimeCalculator {
    private static int minutes;

    static int convertToSeconds (int minutes) {
        return minutes > 0 ? minutes * 60 : 0;
    }
}
