package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
        //Given

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // When

        board.getToDoList().getTasks().add("To Do Task");
        board.getInProgressList().getTasks().add("In Progress Task");
        board.getDoneList().getTasks().add("Done Task");

        // Then
        assertEquals("To Do Task", board.getToDoList().getTasks().get(0));
        assertEquals("In Progress Task", board.getInProgressList().getTasks().get(0));
        assertEquals("Done Task", board.getDoneList().getTasks().get(0));
    }

    @Test
    public void testBoardCreation() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        // When & Then
        assertNotNull(board);
        assertNotNull(board.getToDoList());
        assertNotNull(board.getInProgressList());
        assertNotNull(board.getDoneList());
    }

}
