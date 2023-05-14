package ch3.ch3_10;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("Auto Pilot On");
        System.out.println("The Car moves toward the destination");
    }

    @Override
    public void stop() {
        System.out.println("The Car stop encountering the barrier");
    }
}
