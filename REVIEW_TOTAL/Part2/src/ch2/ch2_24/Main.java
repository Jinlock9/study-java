package ch2.ch2_24;

public class Main {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("Korean", 100);
        studentLee.addSubject("Math", 90);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("Korean", 80);
        studentKim.addSubject("Math", 100);
        studentKim.addSubject("English", 90);

        studentLee.showScoreInfo();
        System.out.println("================================================");
        studentKim.showScoreInfo();
    }
}
