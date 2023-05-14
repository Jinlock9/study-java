package ObjectClass;

import java.util.Objects;

public class Student {

    String name;
    String number;
    int birthYear;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "James";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "James";
        s2.number = "1234";
        s2.birthYear = 1995;


        if(s1.equals(s2)) {
            System.out.println("s1 == s2");
        }
        else {
            System.out.println("s1 != s2");
        }

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 위에, equals and hashCode 는 본래 Object 가 구현한 메소드를 사용하고 있다.
        // 그래서 다른 's1 != s2' 라는 결과와 다른 hashcode 가 나온다.
        // 따라서 적절히 override 해야한다.

        System.out.println(s1);
        System.out.println(s1.toString());
        // toString 을 override 하지 않고 그냥 쓰면 의미 없는 값이 나온다.
        // toString 을 override 해서 사용하면,

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthYear == student.birthYear && Objects.equals(name, student.name) && Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, birthYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
