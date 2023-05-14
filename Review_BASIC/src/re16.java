import java.util.Scanner;

public class re16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Total Number of Students : ");
        int number = scan.nextInt();
        Student[] students = new Student[number];
        for(int i = 0; i < number; i++) {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double gpa;
            System.out.print("Name : ");
            name = scan.next();
            System.out.print("Age : ");
            age = scan.nextInt();
            System.out.print("Height : ");
            height = scan.nextInt();
            System.out.print("Weight : ");
            weight = scan.nextInt();
            System.out.print("Student number : ");
            studentID = scan.next();
            System.out.print("Grade : ");
            grade = scan.nextInt();
            System.out.print("GPA : ");
            gpa = scan.nextDouble();
            students[i] = new Student(name,  age, height, weight, studentID, grade, gpa);
        }

        for(int i = 0; i < number; i++) {
            students[i].show();
        }

    }

}
