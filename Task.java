/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;

public class Task {

    // declare variables
    private String taskId;
    private String taskName;
    private String taskDescription;
    final int TASK_ID_LENGTH = 10;
    final int TASK_NAME_LENGTH = 20;
    final int TASK_DESCRIPTION_LENGTH = 50;
    final String INITIAL_STRING = "";

    // default constructor
    Task() {
        this.taskId = INITIAL_STRING;
        this.taskName = INITIAL_STRING;
        this.taskDescription = INITIAL_STRING;
    }

    // constructor
    public Task(String taskId, String taskName, String taskDescription) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    // function to validate taskId string length and not null
    private boolean validateTaskId(String testString, int maxLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() > maxLength) {
            return false;
        }
        return true;
    }

    // function to validate taskName string length and null
    private boolean validateTaskName(String testString, int maxLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() > maxLength) {
            return false;
        }
        return true;
    }

    // function to validate taskDescription string length and null
    private boolean validateTaskDescription(String testString, int maxLength) {
        if (testString == null) {
            return false;
        }
        if (testString.length() > maxLength) {
            return false;
        }
        return true;
    }

    // taskId getter
    public String getTaskId() {
        return taskId;
    }

    // taskId setter
    public void setTaskId(String taskId) throws IllegalArgumentException {
        if (!validateTaskId(taskId, TASK_ID_LENGTH)) {
            throw new IllegalArgumentException("Task Id is invalid. Ensure value is not null and less than " + TASK_ID_LENGTH + " characters.");
        }
        this.taskId = taskId;
    }

    // taskName getter
    public String getTaskName() {
        return taskName;
    }

    // taskName setter
    public void setTaskName(String taskName) throws IllegalArgumentException {
        if (!validateTaskName(taskName, TASK_NAME_LENGTH)) {
            throw new IllegalArgumentException("Task Name is invalid. Ensure value is not null and less than " + TASK_NAME_LENGTH + " characters.");
        }
        this.taskName = taskName;
    }

    // task description getter
    public String getTaskDescription() {
        return taskDescription;
    }

    // task description setter
    public void setTaskDescription(String taskDescription) throws IllegalArgumentException {
        if (!validateTaskDescription(taskDescription, TASK_DESCRIPTION_LENGTH)) {
            throw new IllegalArgumentException("Task description is invalid. Ensure value is not null and less than " + TASK_DESCRIPTION_LENGTH + " characters.");
        }
        this.taskDescription = taskDescription;
    }
}
