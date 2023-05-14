package ch1_13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        System.out.println("Receive two integers and return larger one");

        Scanner scanner = new Scanner(System.in); // System.it : 표준 입력
        System.out.print("Integer 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Integer 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

    }
}
