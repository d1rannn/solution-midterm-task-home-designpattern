package factories;

import devices.Light;
import devices.Thermostat;
import devices.SmartDevice;

public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        return new Light(name + " (Advanced)");
    }

    @Override
    public SmartDevice createThermostat(String name) {
        return new Thermostat(name + " (Advanced)");
    }
}