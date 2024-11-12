package ToDo.src.main;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

import ToDo.src.main.Task;

public class TaskManager {
    private int nextTaskID = 1;
    private ArrayList<Task> taskList = new ArrayList<>();

    public void saveTasksToFile() {
        try (FileWriter file = new FileWriter("tasks.txt")) { // Dosya yolunu düzeltin
            for (Task task : taskList) {
                file.write(task.getTaskID() + ", " + task.getTaskName() + ", " + task.getTaskDescription() + ", " + task.getTaskStatus() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTask(String taskName, String taskDescription) {
        Task newTask = new Task(nextTaskID++, taskName, taskDescription, false);
        taskList.add(newTask);
    }

    public void removeTask(int taskID) {
        for (Task task : taskList) {
            if (task.getTaskID() == taskID) {
                taskList.remove(task);
                break;
            }
        }
    }

    public void updateTask(int taskID, String taskName, String taskDescription) {
        for (Task task : taskList) {
            if (task.getTaskID() == taskID) {
                task.setTaskName(taskName);
                task.setTaskDescription(taskDescription);
                break;
            }
        }
    }

    public void displayTask() {
        System.out.format("+------------+------------+-------------------+----------------+%n");
        System.out.format("| Task ID    | Task Name  | Task Description  | Task Status    |%n");
        System.out.format("+------------+------------+-------------------+----------------+%n");
        String leftAlignment = "| %-10d | %-10s | %-17s | %-13s |%n"; // Formatlama hatasını düzeltin
        for (Task task : taskList) {
            System.out.format(leftAlignment, task.getTaskID(), task.getTaskName(), task.getTaskDescription(), task.getMark());
        }
        System.out.format("+------------+------------+-------------------+----------------+%n");
    }

    public void markTaskAsComplete(int taskID) {
        for (Task task : taskList) {
            if (task.getTaskID() == taskID) {
                task.markAsComplete();
                break;
            }
        }
    }

    public void markTaskAsIncomplete(String taskName) {
        for (Task task : taskList) {
            if (task.getTaskName().equals(taskName)) {
                task.markAsIncomplete();
                break;
            }
        }
    }
}
