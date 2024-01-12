package org.OOP1;

public class Main {
    public static void main(String[] args) {

        boolean isRectangular1 = Triangle.isRectangularTriangle(6, 8, 10);
        boolean isRectangular2 = Triangle.isRectangularTriangle(7, 4, 9);

        System.out.println(isRectangular1);
        System.out.println(isRectangular2);
    }
}