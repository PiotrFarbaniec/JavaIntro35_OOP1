package org.OOP1;

public class Cinema {
    private final int seatNumber;
    private final String rowNumber;
    private boolean availability = true;


    public Cinema(int seatNumber, String rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }

    public void reserveSeat(boolean reserve) {
        availability = !(reserve);
    }

    static Cinema getSeats(Cinema seats) {
      return seats;
    }


    @Override
    public String toString() {
        return "seat: {" +  this.seatNumber + " " + this.rowNumber + " is available: "+ this.availability + '}';
    }
}
