import java.util.Scanner;

public class re11 {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        // int[] array = new int[#]; index 0 ~ (# - 1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of array : ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < number; i++) {
            System.out.println("Insert an element : ");
            array[i] = scanner.nextInt();
        }
        int result = -1;
        for(int i = 0; i < number; i++) {
            result = max(result, array[i]);
        }
        System.out.println(result);
    }

}
