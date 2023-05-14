package ch1_10;

public class TypeConversionTest {
    public static void main(String[] args) {
        /*
        int iNum = 255;
        byte bNum = (byte) iNum;
        System.out.println(bNum);

        double dNum = 3.14;
        int iNum1 = (int) dNum;
        System.out.println(iNum1);
        */
        double dNum = 1.2;
        float fNum = 1.9F;

        int iNum1 = (int) dNum + (int) fNum;
        int iNum2 = (int) (dNum + fNum);
        System.out.println(iNum1);
        System.out.println(iNum2);

        int myNum = 10;
        int yourNum = 20;
        myNum += yourNum;
        System.out.println(myNum);
    }
}
