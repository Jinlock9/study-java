package ch3.ch3_15;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("Sell order");
    }
}
