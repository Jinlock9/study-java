package ch2.ch2_14;

public class Student {
    String studentName;
    int money;

    public Student() {
        this("no name", 0);
    }

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentName + " has " + money + " won.");
    }
}
