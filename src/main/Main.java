package ToDo.src.main;

import ToDo.src.main.TaskManager;

public class Main {

    TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        Main main = new Main();
        main.taskManager.addTask("Task 1", "This is task 1");
        main.taskManager.addTask("Task 2", "This is task 2");
        main.taskManager.addTask("Task 3", "This is task 3");
        main.taskManager.addTask("Task 4", "This is task 4");
        main.taskManager.addTask("Task 5", "This is task 5");
        main.taskManager.saveTasksToFile();

        main.taskManager.displayTask(); // Parametre geçmeyin
    }
}
