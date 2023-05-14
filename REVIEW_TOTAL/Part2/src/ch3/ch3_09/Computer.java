package ch3.ch3_09;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("Turning on the Computer");
    }

    public void turnOff() {
        System.out.println("Turning off the Computer");
    }
}
