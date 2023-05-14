package ch2.ch2_9;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1, "Bruce Lee");
        studentLee.setKorean("국어", 100);
        studentLee.setMath("수학", 100);
        studentLee.showScoreInfo();

        Student studentKim = new Student(2, "Steve Kim");
        studentLee.setKorean("국어", 80);
        studentLee.setMath("수학", 100);
        studentLee.showScoreInfo();
    }
}
