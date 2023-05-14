package ch2.ch2_6;

public class StudentTest {

    public static void main(String[] args) {
        Student studentKim = new Student();
        System.out.println(studentKim.showStudentInfo());
        Student studentLee = new Student(12345, "Bruce Lee", 5);
        System.out.println(studentLee.showStudentInfo());
    }
}
