
package ToDo.src.main;

public class Task {
    private int taskID;
    private String taskName;
    private String taskDescription;
    private boolean taskStatus;
    private char checkMark = '✅';
    private char crossMark = '❌';

    public Task(int taskID, String taskName, String taskDescription, boolean taskStatus) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskID() {
        return this.taskID;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }

    public boolean getTaskStatus(){
        return this.taskStatus;
    }

    public char getMark(){
        if (this.taskStatus == true){
            return this.checkMark;
        } else {
            return this.crossMark;
        }
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }

    public void setTaskStatus(boolean taskStatus){
        this.taskStatus = taskStatus;
    }

    public void markAsComplete(){
        this.taskStatus = true;
    }

    public void markAsIncomplete(){
        this.taskStatus = false;
    }
}