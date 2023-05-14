package ch1_15;

public class IfElseIfElseTest {
    public static void main(String[] args) {
        int age = 127;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("Preschool Kid");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("Elementary School Kid");
        }
        else if (age < 17) {
            charge = 3000;
            System.out.println("Middle School Kid");
        }
        else {
            charge = 4000;
            System.out.println("High School Kid or above");
        }
        System.out.println("Charge is " + charge);
    }
}
