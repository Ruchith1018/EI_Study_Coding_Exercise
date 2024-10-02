//Balam Ruchith Balaji
 
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TaskFactory {
    public Task createTask(String description, String startTime, String endTime, String priority) throws Exception {
        if (!isValidTimeFormat(startTime) || !isValidTimeFormat(endTime)) {
            throw new Exception("Error: Invalid time format.");
        }
        return new Task(description, startTime, endTime, priority);
    }

    private boolean isValidTimeFormat(String time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            sdf.setLenient(false);
            sdf.parse(time);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
