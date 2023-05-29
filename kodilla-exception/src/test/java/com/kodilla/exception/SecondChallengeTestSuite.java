package com.kodilla.exception;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
@Test
    public void testProbablyWillThrowException(){
    //Given
    SecondChallenge secondChallenge = new SecondChallenge();
    //When & Then
    Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,1));
    Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5));
    Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,0));
    Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,1));
    }
}
