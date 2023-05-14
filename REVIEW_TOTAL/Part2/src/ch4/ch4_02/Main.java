package ch4.ch4_02;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(100, "Lee");
        Student student2 = new Student(100, "Lee");
        Student student3 = student1;

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        // System.out.println(student1 == student3);
        // System.out.println(student1.equals(student3));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student2));

        student1.setName("Kim");
        Student copyStudent = (Student) student1.clone();
        System.out.println(copyStudent);

    }
}
