package ch2.ch2_9;

public class Student {
    int studentId;
    String studentName;

    Subject korean;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void setKorean(String name, int score) {
        this.korean.subjectName = name;
        this.korean.score = score;
    }

    public void setMath(String name, int score) {
        this.math.subjectName = name;
        this.math.score = score;
    }

    public void showScoreInfo() {
        int total = this.korean.score + this.math.score;
        System.out.println(studentName + " {" + studentId + "} " + " : " + total);
    }
}
