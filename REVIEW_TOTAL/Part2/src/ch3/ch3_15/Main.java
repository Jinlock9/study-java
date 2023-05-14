package ch3.ch3_15;

public class Main {
    public static void main(String[] args) {
        /*
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
         */

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("토지1");
        bookQueue.enQueue("토지2");
        bookQueue.enQueue("토지3");
        bookQueue.enQueue("토지4");
        bookQueue.enQueue("토지5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());
    }
}
