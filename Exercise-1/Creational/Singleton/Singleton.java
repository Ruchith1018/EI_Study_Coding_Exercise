//Balam Ruchith Balaji
 
class EventLogger {
    private static EventLogger loggerInstance;

    private EventLogger() {
    }

    public static EventLogger getLogger() {
        if (loggerInstance == null) {
            loggerInstance = new EventLogger();
        }
        return loggerInstance;
    }

    public void record(String event) {
        System.out.println("Event: " + event);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        EventLogger loggerA = EventLogger.getLogger();
        EventLogger loggerB = EventLogger.getLogger();

        loggerA.record("First event recorded.");
        loggerB.record("Second event recorded.");

        System.out.println(loggerA == loggerB); // true, same instance
    }
}
