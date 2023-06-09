package ch3.ch3_14;

public class CompleteCalc extends Calculator {
    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        }
        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("All methods realized.");
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Default Method Override.");
    }
}
