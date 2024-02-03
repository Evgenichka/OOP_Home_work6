package Task_DIP.Task_DIP_2;

class Fan implements Switchable {
    @Override
    public void turnOn() {
// Логика включения вентилятора
        System.out.println("Включить вентилятор");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключить вентилятор");
// Логика выключения вентилятора
    }
}