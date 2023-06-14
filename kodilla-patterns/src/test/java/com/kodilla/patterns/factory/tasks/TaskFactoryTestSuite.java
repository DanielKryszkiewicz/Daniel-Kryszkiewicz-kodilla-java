package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(taskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        assertEquals("Driving", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    void testShoppingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(taskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        assertEquals("Buy", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask(taskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        assertEquals("Paint", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }
}
