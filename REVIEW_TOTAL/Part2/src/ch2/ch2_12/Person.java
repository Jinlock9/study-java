package ch2.ch2_12;

public class Person {

    String name;
    int age;

    public Person() {
        this("No name", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPersonInfo() {
        System.out.println(name + " " + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) { // Testing Main
        Person person = new Person();
        person.showPersonInfo();
        System.out.println(person);

        Person person1 = person.getPerson();
        System.out.println(person1); // same as person
    }
}
