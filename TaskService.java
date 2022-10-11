/*
 * Emily Wood
 * CS 320
 * Module Five Milestone
 * Ramsey Kraya
 */

package org.example;
import java.util.ArrayList;

public class TaskService {

    // create an arrayList to store the tasks
    static ArrayList<Task> taskList = new ArrayList<>();

    // search for taskId
    Task searchTaskId(String taskId) {
        int i = 0;
        while (i < taskList.size()) {
            if (taskId.equals(taskList.get(i).getTaskId())) {
                return taskList.get(i);
            }
            i++;
        }
        throw new IllegalArgumentException("Id does not exist.");
    }

    // add a new task
    public void addTask(String taskName, String taskDescription) {
        String taskId = Integer.toString(taskList.size());
        Task task = new Task(taskId, taskName, taskDescription);
        taskList.add(task);
    }

    // delete task
    public void deleteTask(String taskId) throws Exception {
        taskList.remove(searchTaskId(taskId));
    }

    // update task name
    public void updateTaskName(String taskId, String taskName) throws Exception {
        searchTaskId(taskId).setTaskName(taskName);
    }

    // update task description
    public void updateTaskDescription(String taskId, String taskDescription) throws Exception {
        searchTaskId(taskId).setTaskDescription(taskDescription);
    }
}
