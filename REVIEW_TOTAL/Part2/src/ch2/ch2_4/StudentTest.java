package ch2.ch2_4;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentId = 12345;
        studentLee.setStudentName("Bruce Lee");
        studentLee.address = "Seoul";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.setStudentName("Kimme Kimee");
        studentKim.address = "Busan";

        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
