package com.TaskTracker;
public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        if (args.length==0){
            System.out.println("No arguments provided.");
            return;
        }else{
            String command = args[0];
            switch (command) {
                case "add":
                    taskManager.addTask(args[1]);

                    break;
                case "update":
                    taskManager.updateTask(Integer.parseInt(args[1]), args[2]);
                    break;

                case  "delete":
                    taskManager.deleteTask(Integer.parseInt(args[1]));
                    break;
                case "list":
                    taskManager.listTasks();
                    break;

                default:
                    System.out.println("Unknown command: " + command);
            }
        }
        return;
    }
}