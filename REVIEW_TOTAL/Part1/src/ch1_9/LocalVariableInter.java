package ch1_9;

public class LocalVariableInter {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str1 = str;
        System.out.println(str1);

        str = "Hello";
        System.out.println(str);
        // str = 3;
    }
}
