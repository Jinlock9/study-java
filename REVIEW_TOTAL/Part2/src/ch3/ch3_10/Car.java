package ch3.ch3_10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public void startCar() {
        System.out.println("Starting the Car");
    }
    public void turnOff() {
        System.out.println("Turning off the Car");
    }
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
