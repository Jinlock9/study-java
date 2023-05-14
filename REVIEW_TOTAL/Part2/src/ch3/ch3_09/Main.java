package ch3.ch3_09;

public class Main {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        MyNotebook myNotebook = new MyNotebook();
        desktop.display();
        myNotebook.typing();
    }
}
