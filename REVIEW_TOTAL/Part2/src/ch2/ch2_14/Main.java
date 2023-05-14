package ch2.ch2_14;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("James", 10000);
        Student student2 = new Student("Steve", 5000);

        Bus bus100 = new Bus(100);
        Bus bus5000 = new Bus(5000);

        student1.takeBus(bus100);

        Subway line2 = new Subway(2);
        Subway line4 = new Subway(4);

        student2.takeSubway(line4);

        student1.showInfo();
        student2.showInfo();
        bus100.showBusInfo();
        bus5000.showBusInfo();
        line2.showSubwayInfo();
        line4.showSubwayInfo();
    }
}
