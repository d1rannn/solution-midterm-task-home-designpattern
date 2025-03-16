package decorators;

import devices.SmartDevice;

public abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice device;

    public SmartDeviceDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }
}