package org.OOP1;

public class Cinema {
    private int seatNumber;
    private String rowNumber;
    private boolean isAvailable = true;


    public Cinema(int seatNumber, String rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }


    public void isFree(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "seat: {" +  this.seatNumber + " " + this.rowNumber + " is available: "+ this.isAvailable + '}';
    }
}
