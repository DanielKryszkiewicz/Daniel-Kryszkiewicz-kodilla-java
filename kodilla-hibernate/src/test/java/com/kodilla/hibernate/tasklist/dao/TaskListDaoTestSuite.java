package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Hibernate";

    @Test
    void testFIndByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "Learning Hibernate");
        taskListDao.save(taskList);
        String taskName = taskList.getListName();
        //When
        List<TaskList> readTask = taskListDao.findByListName(taskName);
        //Then
        assertEquals(1, readTask.size());
        //Clean
        taskListDao.delete(taskList);
    }
}




