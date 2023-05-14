public class Student extends Person {

    private String studentID;
    private int grade;
    private double GPA;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Student(String name, int age, int height, int weight, String studentID, int grade, double GPA) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GPA;
    }

    public void show() {
        System.out.println(getGPA());
        System.out.println(getStudentID());
        System.out.println(getGrade());
        System.out.println(getAge());
        System.out.println(getHeight());
        System.out.println(getName());
        System.out.println(getWeight());
    }
}
