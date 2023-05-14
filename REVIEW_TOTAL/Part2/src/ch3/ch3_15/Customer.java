package ch3.ch3_15;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer Sell");
    }

    @Override
    public void order() {
        System.out.println("Customer's order");
    }

    public void hello() {
        System.out.println("Hello!");
    }
}
