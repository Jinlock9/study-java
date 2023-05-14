package ch3.ch3_02;

public class Main {
    public static void main(String[] args) {
        Customer customerLee = new Customer(123, "Lee");
        customerLee.bonusPoint = 1000;
        customerLee.showCustomerInfo();
        System.out.println("-----------------------------------------------");

        VIP vipKim = new VIP(124, "Kim");
        vipKim.bonusPoint = 10000;
        vipKim.showCustomerInfo();
        System.out.println("-----------------------------------------------");

        Customer vc = new VIP(125, "VC");
        vc.showCustomerInfo();  // only use Customer's attributes
    }
}
