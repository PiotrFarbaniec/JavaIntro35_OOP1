package org.OOP1;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String directorName;
    private int duration;
    private LocalDate date;

    public Movie() {
    }

    public Movie(String title, String directorName, int duration, LocalDate date) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String directorName) {
        this.directorName = directorName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "Title: " + "\"" + title + "\"" +
                ", director: " + directorName + "\n"+
                "duration: " + duration + " min" +
                ", release: " + date;
    }
}
