package ch3.ch3_10;

public class Main {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("--------------------------------------");
        Car mCar = new ManualCar();
        mCar.run();
    }
}
