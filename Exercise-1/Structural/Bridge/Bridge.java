//Balam Ruchith Balaji
 
// Appliance Interface
interface Appliance {
    void powerOn();
    void powerOff();
}

// Concrete Appliance Implementations
class WashingMachine implements Appliance {
    public void powerOn() {
        System.out.println("Washing Machine is ON.");
    }

    public void powerOff() {
        System.out.println("Washing Machine is OFF.");
    }
}

class AirConditioner implements Appliance {
    public void powerOn() {
        System.out.println("Air Conditioner is ON.");
    }

    public void powerOff() {
        System.out.println("Air Conditioner is OFF.");
    }
}

// Abstract Remote (Controller)
abstract class Controller {
    protected Appliance appliance;

    public Controller(Appliance appliance) {
        this.appliance = appliance;
    }

    // Abstract method to control power state
    public abstract void switchPower();
}

// Concrete Controller (Button Controller)
class ButtonController extends Controller {
    private boolean isPoweredOn = false;

    public ButtonController(Appliance appliance) {
        super(appliance);
    }

    @Override
    public void switchPower() {
        if (isPoweredOn) {
            appliance.powerOff();
        } else {
            appliance.powerOn();
        }
        isPoweredOn = !isPoweredOn;
    }
}

// Main class to demonstrate Bridge Pattern
public class BridgeExample {
    public static void main(String[] args) {
        // Create specific appliance instances
        Appliance washingMachine = new WashingMachine();
        Appliance airConditioner = new AirConditioner();

        // Create controller for washing machine
        Controller controller = new ButtonController(washingMachine);
        controller.switchPower(); // Washing Machine is ON
        controller.switchPower(); // Washing Machine is OFF

        // Switch to controller for air conditioner
        controller = new ButtonController(airConditioner);
        controller.switchPower(); // Air Conditioner is ON
        controller.switchPower(); // Air Conditioner is OFF
    }
}
