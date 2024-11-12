package ToDo.src.main;


public abstract class TaskManager {
    private int taskID = 0;
    private String taskName;
    private String taskDescription;
    private boolean taskStatus;

    public TaskManager(String taskName, String taskDescription, boolean taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public void addTask(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = false;
        this.taskID++;
    }

    public void removeTask(String taskName) {

    }

    public void updateTask(String taskName, String taskDescription) {
       
    }

    public void displayTask(String taskName) {
        
    }

    public void displayAllTasks() {
        
    }

    public void markTaskAsComplete(String taskName) {
        
    }

    public void markTaskAsIncomplete(String taskName) {
        
    }


}
