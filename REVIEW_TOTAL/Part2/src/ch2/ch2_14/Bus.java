package ch2.ch2_14;

public class Bus {
    int busNumber;
    int passengerCount;
    int income;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
        this.passengerCount = 0;
        this.income = 0;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount++;
    }

    public void showBusInfo() {
        System.out.println("Bus-" + busNumber + " has " + income + " won.");
        System.out.println("There are " + passengerCount + " passengers.");
    }
}
