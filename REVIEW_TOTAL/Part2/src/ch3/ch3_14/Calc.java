package ch3.ch3_14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    default void description() {
        myMethod();
        System.out.println("Provide Calculation of Integers");
    }

    static int total(int[] arr) {
        int total = 0;
        for (int num: arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod() {  // default method 에서 사용 가능
        System.out.println("My Method");
    }

    private static void myStaticMethod() {  // static method 에서 사용 가능
        System.out.println("My Static Method");
    }
}
