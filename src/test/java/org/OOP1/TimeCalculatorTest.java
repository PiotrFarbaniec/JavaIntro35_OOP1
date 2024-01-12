package org.OOP1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalculatorTest {

    @Test
    void TenMinutesShouldReturnSixHundred() {
    //given
        int minutes = 10;
        int expResult = 600;

    //when
        int result = TimeCalculator.convertToSeconds(minutes);

    //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void FiftyMinutesShouldReturnThreeThousand() {
        //given
        int minutes = 50;
        int expResult = 3000;

        //when
        int result = TimeCalculator.convertToSeconds(minutes);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void WhenTimeIsLessThanZeroShouldReturnZero() {
        //given
        int minutes = -10;
        int expResult = 0;

        //when
        int result = TimeCalculator.convertToSeconds(minutes);

        //then
        Assertions.assertEquals(expResult, result);
    }

}