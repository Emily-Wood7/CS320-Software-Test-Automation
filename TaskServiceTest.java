/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    // set up test variables
    final String testId = "0";
    final String failTestId = "1";
    final String testTaskName = "Test Name";
    final String testTaskDescription = "Test Description";
    final String testNewTaskName = "New Name";
    final String testNewDescription = "New Test Description";
    TaskService task;

    @BeforeEach
    // create a new instance for each test
    public void setUp() {
        task = new TaskService();
    }

    @AfterEach
    // empty the arraylist after each test
    public void tearDown() {
        TaskService.taskList.clear();
    }

    @Test
    // test an id that does not exist
    void testSearchTaskId() {
        task.addTask(testTaskName, testTaskDescription);

        assertAll(
                () -> assertEquals(testId, task.searchTaskId(testId).getTaskId()),
                () -> assertThrows(IllegalArgumentException.class, () -> task.searchTaskId(failTestId).getTaskId())
        );
    }

    @Test
    // test to add a new task
    void testAddTask() {
        task.addTask(testTaskName, testTaskDescription);
        assertAll(
                () -> assertEquals(testId, TaskService.taskList.get(0).getTaskId()),
                () -> assertEquals(testTaskName, TaskService.taskList.get(0).getTaskName()),
                () -> assertEquals(testTaskDescription, TaskService.taskList.get(0).getTaskDescription())
        );
    }

    @Test
    void testDeleteTask() throws Exception {
        task.addTask(testTaskName, testTaskDescription);

        int taskListSize = TaskService.taskList.size();

        // delete task
        task.deleteTask(testId);

        // verify task was deleted
        assertEquals(taskListSize - 1, TaskService.taskList.size());

    }

    @Test
    void testUpdateTaskName() throws Exception {
        task.addTask(testTaskName, testTaskDescription);

        // update task name
        task.updateTaskName(testId, testNewTaskName);

        // verify new name matches Id Number
        assertEquals(testNewTaskName, TaskService.taskList.get(0).getTaskName());
    }

    @Test
    void testUpdateTaskDescription() throws Exception {
        task.addTask(testTaskName, testTaskDescription);

        task.updateTaskDescription(testId, testNewDescription);
        assertEquals(testNewDescription, TaskService.taskList.get(0).getTaskDescription());
    }
}
