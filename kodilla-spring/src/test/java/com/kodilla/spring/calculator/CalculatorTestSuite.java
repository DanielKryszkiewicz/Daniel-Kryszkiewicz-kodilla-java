package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void calculateTest() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2, 2);
        double sub = calculator.sub(2, 2);
        double mul = calculator.mul(2, 3);
        double div = calculator.div(6, 2);

        //Then
        Assertions.assertEquals(4, add);
        Assertions.assertEquals(0, sub);
        Assertions.assertEquals(6, mul);
        Assertions.assertEquals(3, div);
    }
}

