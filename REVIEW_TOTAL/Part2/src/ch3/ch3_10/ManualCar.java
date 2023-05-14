package ch3.ch3_10;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("You drives the Car");
        System.out.println("The Car moves");
    }

    @Override
    public void stop() {
        System.out.println("You stop the Car");
    }
}
