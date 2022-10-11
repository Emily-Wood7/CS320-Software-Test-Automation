/*
 * Emily Wood
 * SNHU CS-320
 * Project One
 * October 11, 2022
 */

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    final String nullTest = null;
    final String longIdTest = "01234567890";
    final String longNameTest = "012345678901234567890";
    final String longDescriptionTest = "012345678901234567890123456789012345678901234567890";
    final String goodTest = "Good Test";
    Task task;

    @BeforeEach
    // create a new instance before each test
    public void setUp() {
        task = new Task();
    }

    @Test
    // testing setter and getter good test
    void testGetTaskId() {
        task.setTaskId(goodTest);
        assertTrue(task.getTaskId() == goodTest);
    }

    @Test
    // testing setter invalid entries
    void testSetTaskId() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> task.setTaskId(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> task.setTaskId(longIdTest))
        );
    }

    @Test
        // testing setter and getter good test
    void testGetTaskName() {
        task.setTaskName(goodTest);
        assertTrue(task.getTaskName() == goodTest);
    }

    @Test
        // testing setter invalid entries
    void testSetTaskName() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> task.setTaskName(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> task.setTaskName(longNameTest))
        );
    }

    @Test
        // testing setter and getter good test
    void testGetTaskDescription() {
        task.setTaskDescription(goodTest);
        assertTrue(task.getTaskDescription() == goodTest);
    }

    @Test
        // testing setter invalid entries
    void testSetTaskDescription() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> task.setTaskDescription(nullTest)),
                () -> assertThrows(IllegalArgumentException.class, () -> task.setTaskDescription(longDescriptionTest))
        );
    }
}
