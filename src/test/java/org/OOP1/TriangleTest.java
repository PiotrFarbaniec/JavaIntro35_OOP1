package org.OOP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void dimensionsSixEightAndTenShouldReturnTrue() {
        //given
        int dimA = 6;
        int dimB = 8;
        int dimC = 10;
        boolean expResult = true;

        //when
        boolean result = Triangle.isRectangularTriangle(dimA, dimB, dimC);

        //then
        Assertions.assertEquals(expResult, result);

    }

    @Test
    void dimensionsSevenFourAndNineShouldReturnFalse() {
        //given
        int dimA = 7;
        int dimB = 4;
        int dimC = 9;
        boolean expResult = false;

        //when
        boolean result = Triangle.isRectangularTriangle(dimA, dimB, dimC);

        //then
        Assertions.assertEquals(expResult, result);

    }

    @Test
    void whenSomeDimensionIsLessThanZeroShouldReturnFalse() {
        //given
        int dimA = 6;
        int dimB = -8;
        int dimC = 10;
        boolean expResult = false;

        //when
        boolean result = Triangle.isRectangularTriangle(dimA, dimB, dimC);

        //then
        Assertions.assertEquals(expResult, result);
    }
}