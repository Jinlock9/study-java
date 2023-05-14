package ch3.ch3_04;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        Customer customerLee = new Customer(123, "Lee");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        customerLee.showCustomerInfo();
        System.out.println("Price is " + price);
        System.out.println("-----------------------------------------------");

        VIP vipKim = new VIP(124, "Kim");
        vipKim.bonusPoint = 10000;
        price = vipKim.calcPrice(1000);
        vipKim.showCustomerInfo();
        System.out.println("Price is " + price);
        System.out.println("-----------------------------------------------");

        Customer vc = new VIP(125, "VC");
        System.out.println("Price is " + vc.calcPrice(1000));
    }
}
