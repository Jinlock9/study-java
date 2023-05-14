package ch3.ch3_11;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.mul(num1, num2));
        System.out.println(calc.div(num1, num2));
    }
}
