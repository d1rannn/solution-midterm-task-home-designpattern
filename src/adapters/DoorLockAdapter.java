package adapters;

import devices.SmartDevice;

public class DoorLockAdapter implements SmartDevice {
    private LegacyDoorLock legacyDoorLock;

    public DoorLockAdapter(LegacyDoorLock legacyDoorLock) {
        this.legacyDoorLock = legacyDoorLock;
    }

    @Override
    public void turnOn() {
        legacyDoorLock.unlock();
    }

    @Override
    public void turnOff() {
        legacyDoorLock.lock();
    }
}