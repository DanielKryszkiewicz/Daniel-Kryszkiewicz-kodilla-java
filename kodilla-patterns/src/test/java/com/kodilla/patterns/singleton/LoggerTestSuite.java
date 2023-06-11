package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void getLastLogTest() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("Daniel");
        //When
        String result = logger.getLastLog();
        //Then
        Assertions.assertEquals(result, "Daniel");

    }
}
