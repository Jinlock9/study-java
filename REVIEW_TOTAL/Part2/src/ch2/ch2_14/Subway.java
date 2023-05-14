package ch2.ch2_14;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int income;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
        this.passengerCount = 0;
        this.income = 0;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println("Subway-" + subwayNumber + " has " + income + " won.");
        System.out.println("There are " + passengerCount + " passengers.");
    }
}
