package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Testing started");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Testing done");
    }

    @Nested
    @DisplayName("Test for ShapeCollector class")
    class ShapeCollectorTests {


        @Test
        @DisplayName("Testing adding figure")
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Rectangle rectangle = new Rectangle(2, 4);
            //When
            shapeCollector.addFigure(rectangle);
            double result = shapeCollector.getShapeListSize();
            //Then
            Assertions.assertEquals(1, result);
        }

        @Test
        @DisplayName("Testing removing figure")
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(3);
            shapeCollector.addFigure(square);
            //When
            shapeCollector.removeFigure(square);
            int expectedLength = 0;
            //Then
            Assertions.assertEquals(expectedLength, shapeCollector.getShapeListSize());
        }

        @Test
        @DisplayName("Testing getting figure")
        void testGetFigure() {
            //Given
            Shape square = new Square(3);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);
            //When
            Shape result = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, result);

        }

        @Test
        @DisplayName("Testing printing figure")
        void testShowFigure() {
            //Given
            Rectangle rectangle = new Rectangle(6, 2);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(rectangle);
            //When
            String shapesName = shapeCollector.showFigures();

            //Then

            Assertions.assertEquals("Rectangle", shapesName);
        }
    }
}
