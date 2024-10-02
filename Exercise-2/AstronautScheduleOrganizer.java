import java.util.logging.*;

public class AstronautScheduleOrganizer {
    public static void main(String[] args) throws Exception {
        // Set up Logger
        Logger logger = Logger.getLogger(AstronautScheduleOrganizer.class.getName());
        FileHandler fileHandler = new FileHandler("schedule.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
        logger.setLevel(Level.INFO);

        ScheduleManager manager = ScheduleManager.getInstance();
        TaskObserver observer = new TaskObserver();
        manager.addObserver(observer);
        
        TaskFactory factory = new TaskFactory();

        try {
            // Adding tasks
            Task task1 = factory.createTask("Morning Exercise", "07:00", "08:00", "High");
            manager.addTask(task1);

            Task task2 = factory.createTask("Team Meeting", "09:00", "10:00", "Medium");
            manager.addTask(task2);

            // View tasks
            manager.viewTasks();

            // Edit task
            manager.editTask("Team Meeting", "Project Discussion", "09:00", "10:00", "Medium");

            // Mark task as completed
            manager.markTaskCompleted("Morning Exercise");

            // View tasks filtered by priority
            manager.viewTasksByPriority("Medium");

            // Remove task
            manager.removeTask("Project Discussion");

        } catch (Exception e) {
            logger.severe("Exception occurred: " + e.getMessage());
        }
    }
}
