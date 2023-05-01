package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Testing started");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("Testing done");
    }

    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Rectangle rectangle = new Rectangle(2,4);
        //When
        shapeCollector.addFigure(rectangle);
        double result = shapeCollector.getShapeListSize();
        //Then
        Assertions.assertEquals(1,result);
    }
    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(3);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(square);
        int expectedLength = 0;
        //Then
        Assertions.assertEquals(expectedLength,shapeCollector.getShapeListSize());
    }

    @Test
    void testGetFigure(){
        //Given
        Square square = new Square(3);
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        //When
        Shape result = shapeCollector.getFigure(1);
        //Then
        Assertions.assertEquals(square,result);

    }
    @Test
    void testShowFigure(){
        //Given
        Square square = new Square(3);
        Circle circle = new Circle(3.14, 2);
        Rectangle rectangle = new Rectangle(6,2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        //When
        String shapesName = shapeCollector.showFigures();

        //Then

        Assertions.assertEquals("squarecirclerectangle", shapesName);
    }
}
