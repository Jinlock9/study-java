package StringBufferClass;

public class Main {

    public static void main(String[] args) {

        /*
         * String 클래스는 자기 자신이 변하지 않는 불변클래스
         * 반면 StringBuffer 클래스는 자기 자신이 변함
         */

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String str = sb.toString();
        // StringBuffer 의 toString 의 return value 는 String type
        System.out.println(str);
        // 'Hello World'

        // StringBuffer 가 가진 methods 는 대부분 자기 자신을 반환
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = sb1.append("Hello");
        if(sb1 == sb2) {
            System.out.println("sb1 == sb2");
        }
        // 'sb1 == sb2'

        /*
         * Method Chaining :
         * 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
         */
        String str1 = new StringBuffer().append("Hello").append(" ").append("World").toString();
        System.out.println(str1);
        // 'Hello World'

    }

}
