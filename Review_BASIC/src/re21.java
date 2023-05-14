import java.util.Scanner;

public class re21 {

    public static void main(String[] args) {

        Fruit fruit;

        Fruit banana = new Banana();
        banana.show();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Banana : 1, Peach : 2 ?");
        int input = scanner.nextInt();
        if(input == 1) {
            fruit = new Banana();
            fruit.show();
        }
        else if(input == 2) {
            fruit = new Peach();
            fruit.show();
        }
    }

}
