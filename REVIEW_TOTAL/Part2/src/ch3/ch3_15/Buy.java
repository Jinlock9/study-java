package ch3.ch3_15;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("Buy order");
    }
}
