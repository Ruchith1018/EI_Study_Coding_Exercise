//Balam Ruchith Balaji
 
import java.util.*;
import java.util.logging.*;

public class ScheduleManager extends Observable {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private static final Logger logger = Logger.getLogger(ScheduleManager.class.getName());

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        for (Task t : tasks) {
            if (isConflict(t, task)) {
                setChanged();
                notifyObservers("Error: Task conflicts with existing task \"" + t.getDescription() + "\".");
                logger.severe("Conflict detected with task: " + t.getDescription());
                return;
            }
        }
        tasks.add(task);
        setChanged();
        notifyObservers("Task added successfully. No conflicts.");
        logger.info("Task added: " + task.getDescription());
    }

    public void removeTask(String description) {
        boolean removed = tasks.removeIf(t -> t.getDescription().equals(description));
        setChanged();
        if (removed) {
            notifyObservers("Task removed successfully.");
            logger.info("Task removed: " + description);
        } else {
            notifyObservers("Error: Task not found.");
            logger.warning("Attempt to remove non-existent task: " + description);
        }
    }

    public void editTask(String oldDescription, String newDescription, String startTime, String endTime, String priority) throws Exception {
        for (Task task : tasks) {
            if (task.getDescription().equals(oldDescription)) {
                task.editTask(newDescription, startTime, endTime, priority);
                setChanged();
                notifyObservers("Task edited successfully.");
                logger.info("Task edited: " + newDescription);
                return;
            }
        }
        setChanged();
        notifyObservers("Error: Task not found.");
        logger.warning("Attempt to edit non-existent task: " + oldDescription);
    }

    public void markTaskCompleted(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                task.markCompleted();
                setChanged();
                notifyObservers("Task marked as completed.");
                logger.info("Task marked completed: " + description);
                return;
            }
        }
        setChanged();
        notifyObservers("Error: Task not found.");
        logger.warning("Attempt to mark non-existent task as completed: " + description);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            setChanged();
            notifyObservers("No tasks scheduled for the day.");
            logger.info("No tasks available for viewing.");
        } else {
            tasks.sort(Comparator.comparing(Task::getStartTime));
            for (Task task : tasks) {
                System.out.println(task);
            }
            logger.info("Tasks viewed.");
        }
    }

    public void viewTasksByPriority(String priority) {
        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                filteredTasks.add(task);
            }
        }
        if (filteredTasks.isEmpty()) {
            setChanged();
            notifyObservers("No tasks with priority: " + priority);
            logger.info("No tasks found for priority: " + priority);
        } else {
            filteredTasks.sort(Comparator.comparing(Task::getStartTime));
            for (Task task : filteredTasks) {
                System.out.println(task);
            }
            logger.info("Tasks viewed by priority: " + priority);
        }
    }

    private boolean isConflict(Task existingTask, Task newTask) {
        return !(newTask.getEndTime().compareTo(existingTask.getStartTime()) <= 0 ||
                 newTask.getStartTime().compareTo(existingTask.getEndTime()) >= 0);
    }
}
