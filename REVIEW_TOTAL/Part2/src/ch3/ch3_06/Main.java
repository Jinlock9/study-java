package ch3.ch3_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer silverLee = new Customer(123, "S. Lee");
        Customer silverKim = new Customer(123, "S. Kim");
        Customer goldPark = new Gold(124, "G. Park");
        Customer vipChoi = new VIP(125, "V. Choi");

        customers.add(silverLee);
        customers.add(silverKim);
        customers.add(goldPark);
        customers.add(vipChoi);

        System.out.println("Customer Profiles ---------------");
        for (Customer customer: customers) {
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("---------------------------------");

        System.out.println("Log -----------------------------");
        int price = 10000;
        for (Customer customer: customers) {
            System.out.println(customer.getCustomerName() + " ----------------");
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " paid " + cost + " won.");
            System.out.println(customer.getCustomerName() + " has " + customer.bonusPoint + " points");
            System.out.println("-----------------------");
        }
        System.out.println("---------------------------------");

        if (vipChoi instanceof VIP) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
