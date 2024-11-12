package ToDo.src.main;

import java.util.Date;
import src.ToDo;

public class Todo extends TaskManager {

    public Todo(int taskID, String taskName, String taskDescription, boolean taskStatus) {
        super(taskID, taskName, taskDescription, taskStatus);
    }

}
