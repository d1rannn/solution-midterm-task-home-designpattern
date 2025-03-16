package factories;

import devices.SmartDevice;

public interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
}