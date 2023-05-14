package StringClass;

public class Main {

    /*
     * [ String Class ]
     * The class dealing character string.
     * Unchangeable class.
     */

    public static void main(String[] args) {

        // [ String Class 의 문제점 1 ]

        String str1 = "Hello World";
        String str2 = str1.substring(5);
        System.out.println(str1);
        // 'Hello World'
        System.out.println(str2);
        // ' World'

        String str3 = str1 + str2;
        System.out.println(str3);
        // 'Hello World World'
        // 겉보기에는 아무런 문제가 없다

        String str4 = new StringBuffer().append(str1).append(str2).toString();
        // str1 + str2 는 new StringBuffer().append(str1).append(str2).toString() 와 동일
        System.out.println(str4);
        // 'Hello World World'

        String str5 = "";
        for(int i = 0; i < 10; i++) {
            str5 = str5 + "*";
        }
        System.out.println(str5);
        // '**********'
        // 즉 for 문이 한번 돌 때 마다
        // str5 = new StringBuffer().append(str5).append("*").toString();
        // new 연산자가 생성되는 것이다.
        // 이때 java 는 new 연산자가 많이 사용될수록 프로그램 숫자가 느려진다.

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 10; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
        // '**********'
        // 이렇게 사용하는 것이 훨씬 빠르다

    }
}
