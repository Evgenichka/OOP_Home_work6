package Task_DIP;

class DeviceManager {
    private Switch deviceSwitch = new Switch();

    void turnOnDevice() {
        deviceSwitch.turnOn();
    }

    void turnOffDevice() {
        deviceSwitch.turnOff();
    }
}
