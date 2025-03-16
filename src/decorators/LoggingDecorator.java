package decorators;

import devices.SmartDevice;

public class LoggingDecorator extends SmartDeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("[LOG]: Turning ON");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("[LOG]: Turning OFF");
        super.turnOff();
    }
}