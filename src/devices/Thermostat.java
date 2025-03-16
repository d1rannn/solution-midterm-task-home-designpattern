package devices;

public class Thermostat implements SmartDevice {
    private String name;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " thermostat is set to ON mode.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " thermostat is set to OFF mode.");
    }
}