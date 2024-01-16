package org.oop1;

public class CinemaSeat {
    private final int seatNumber;
    private final String rowNumber;
    private boolean isAvailable = true;

    public CinemaSeat(int seatNumber, String rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }

    public void reserveSeat(boolean isReserved) {
        this.isAvailable = !(isReserved);
    }


    @Override
    public String toString() {
        return "seat: {" +  this.seatNumber + " " + this.rowNumber + " is available: "+ this.isAvailable + '}';
    }
}
