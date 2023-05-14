package ch3.ch3_09;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("Desktop Display");
    }

    @Override
    public void typing() {
        System.out.println("Type on Desktop");
    }
}
