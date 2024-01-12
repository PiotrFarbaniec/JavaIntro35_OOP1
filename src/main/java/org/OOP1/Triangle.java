package org.OOP1;

public class Triangle {
    static boolean isRectangularTriangle(double dimA, double dimB, double dimC){
        return dimA>0 && dimB > 0 && dimC > 0 &&
               dimC*dimC == dimA*dimA + dimB*dimB;
    }
}
