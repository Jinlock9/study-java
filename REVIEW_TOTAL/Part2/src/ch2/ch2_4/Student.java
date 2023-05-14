package ch2.ch2_4;

public class Student {

    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentId + " : " + studentName + " - address: " + address);
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
}
