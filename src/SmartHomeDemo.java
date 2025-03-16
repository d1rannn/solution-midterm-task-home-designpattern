import devices.*;
import decorators.*;
import factories.*;
import facade.*;
import java.util.*;

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartDevice light = new LoggingDecorator(factory.createLight("Living Room"));
        SmartDevice thermostat = factory.createThermostat("Bedroom");
        Room room = new Room("Main Room");
        room.addDevice(light);
        room.addDevice(thermostat);
        SmartHomeController controller = new SmartHomeController(Arrays.asList(light, thermostat, room));
        controller.turnAllOn();
        controller.turnAllOff();
    }
}