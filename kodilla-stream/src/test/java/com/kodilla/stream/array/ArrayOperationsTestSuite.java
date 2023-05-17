package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
   void testGetAverage(){
        //Given
        int[] numbers = {1,6,4,7,9};
        double expAvg = 5.4;
        //When
        double actualAverage = ArrayOperations.getAverage(numbers);
        //Then
        Assertions.assertEquals(expAvg, actualAverage, 0.01);

    }
}
