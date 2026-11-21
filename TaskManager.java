package com.TaskTracker;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    void addTask(String description) {
        Task task = new Task(nextId++, description);
        tasks.add(task);
        System.out.println("Task added:" + task.getDescription());
    }

     void updateTask(int id, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setDescription(newDescription);
                task.setUpdatedAt(java.time.LocalDateTime.now());
                System.out.println("Task updated: " + task.getDescription());
                return;
            }
        }
    }

     void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("Task deleted with ID: " + id);
    }

     void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println("ID: " + task.getId() + ", Description: " + task.getDescription() + ", Status: " + task.getStatus());
        }
    }

     void markTaskAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus("done");
                task.setUpdatedAt(java.time.LocalDateTime.now());
                System.out.println("Task marked as done: " + task.getDescription());
                return;
            }
        }
    }

     void markTaskAsInProgress(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus("in progress");
                task.setUpdatedAt(java.time.LocalDateTime.now());
                System.out.println("Task marked as in progress: " + task.getDescription());
                return;
            }
        }
    }




}

