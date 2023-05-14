package ch2.ch2_24;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;

    ArrayList<Subject> subjects;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjects = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjects.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;

        for (Subject subject : subjects) {
            total += subject.getScore();
            System.out.println(studentName + " : " + subject.getName() + " - " + subject.getScore());
        }

        System.out.println("Total Score : " + total);
    }
}
