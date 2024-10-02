//Balam Ruchith Balaji
 
import java.util.Observer;
import java.util.Observable;

public class TaskObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg.toString());
    }
}
