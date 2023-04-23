package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("Checking if method works correctly when list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, result);
    }
    @DisplayName("Checking if method works correctly with even and odd numbers in the list")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(6);
        list1.add(4);

        list2.add(2);
        list2.add(6);
        list2.add(4);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list1);
        //Then
        Assertions.assertEquals(list2,result);
    }
}
