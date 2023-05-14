package ch2.ch2_6;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    // default constructor
    public Student() {}

    // constructor overloading
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
        System.out.println("New Student Object Created");
    }

    public String showStudentInfo() {
        return studentNumber + " : " + studentName + " (" + grade + ")";
    }
}
