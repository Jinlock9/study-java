public class re15 {

    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20, 180, 80, "20200101", 1, 4);
        student1.show();

        Teacher teacher1 = new Teacher("홍길동", 20, 180, 80, "12203", 3000000, 4);
        teacher1.show();

        Student[] students = new Student[100];
        for(int i = 0; i < 100; i++) {
            students[i] = new Student("홍길동", 20, 180, 80, i+"", 1, 4);
            students[i].show();
        }
    }

}
