package facade;

import devices.SmartDevice;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices;

    public SmartHomeController(List<SmartDevice> devices) {
        this.devices = devices;
    }

    public void turnAllOn() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}