package ch2.ch2_18;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2); // same

        Calendar calendar = Calendar.getInstance(); // also Singleton
    }
}
