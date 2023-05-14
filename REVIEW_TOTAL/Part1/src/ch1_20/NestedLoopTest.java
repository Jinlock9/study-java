package ch1_20;

public class NestedLoopTest {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            for (int count = 1; count <= 9; count++) {
                System.out.println(dan + " X " + count + " = " + dan * count);
            }
            System.out.println();
        }
        System.out.println("========================================================================================");
        int dan = 2;
        int count = 1;
        while (dan <= 9) {
            while (count <= 9) {
                System.out.println(dan + " X " + count + " = " + dan * count);
                count++;
            }
            System.out.println();
            dan++;
            count = 1;
        }
    }
}
