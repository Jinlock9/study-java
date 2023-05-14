package JavaLangPackage;

public class Main {

    /*
     * [ java.lang package ]
     *
     *  - wrapper : 기본형 데이터 타입의 객체화를 가능하게 도와주는 클래스들
     *  - Object
     *  - String
     *  - StringBuffer
     *  - StringBuilder
     *  - System
     *  - Math
     *  - etc.
     *
     */

    public static void main(String[] args) {

        int i = 5; // 기본형 타입이라 객체가 아님, 참조형이 아님
        Integer i2 = new Integer(5); // 숫자 5를 객체, 참조형으로 만듬

        Integer i3 = 5; // 문제 없이 작동, 기본형이지만 자동으로 integer 로 형 변환됨
        // 오토박싱 : 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
        // ex. 위의 코드에서 5 를 new Integer(5) 로 인식

        int i4 = i3.intValue();

        int i5 = i3;
        // 오토언박싱 : 오토박싱과 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환

    }

}
