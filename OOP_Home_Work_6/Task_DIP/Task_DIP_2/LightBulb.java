package Task_DIP.Task_DIP_2;

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
// Логика включения лампочки
        System.out.println("Включить лампу");
    }

    @Override
    public void turnOff() {
// Логика выключения лампочки
        System.out.println("Выключить лампу");
    }
}