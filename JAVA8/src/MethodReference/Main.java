package MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        // [ Static Method 참조:    Type::Static Method ]

        UnaryOperator<String> hi = (s) -> "hi" + s;
        UnaryOperator<String> refHi = Greeting::hi; // static method
        // 위는 method 를 호출 한 것은 아님.
        System.out.println(refHi.apply("Jinlock"));

        // [ 특정 객체의 인스턴스 메소드 참조:    객체 레퍼런스::인스턴스 메소드 ]

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello; //instance method of certain object reference
        // 위는 method 를 호출 한 것은 아님.
        System.out.println(hello.apply("Jinlock"));

        Supplier<Greeting> newGreeting = Greeting::new;
        // 위는 method 를 호출 한 것은 아님.
        newGreeting.get(); // 을 해야 인스턴스가 만들어짐.

        // [ 생성자 참조:    Type::new ]

        Function<String, Greeting> jinlockGreeting = Greeting::new;
        // 문자열을 받는 생성자 참조
        Greeting jinlock = jinlockGreeting.apply("Jinlock");
        System.out.println(jinlock.getName());

        Supplier<Greeting> newGreeeting2 = Greeting::new;
        // 문자열을 받지 않는 생성자 참조

        // [ 임의 객체의 인스턴스 메소드 참조:    Type::인스턴스 메소드 ]

        String[] names = {"Jinlock", "Happy", "Jesus"};
        /*
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
         */
        // Lambda
        //Arrays.sort(names, (o1, o2) -> 0);
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }

}

/*
 * [ Method Reference ]
 *
 * 람다가 하는 일이 기존 메소드 또는 생성자를 호출하는 거라면,
 * 메소드 레퍼런스를 사용해서 매우 간결하게 표현할 수 있다.
 *
 * 메소드 참조하는 방법
 *  - Static Method 참조:    Type::Static Method
 *  - 특정 객체의 인스턴스 메소드 참조:    객체 레퍼런스::인스턴스 메소드
 *  - 임의 객체의 인스턴스 메소드 참조:    Type::인스턴스 메소드
 *  - 생성자 참조:    Type::new
 *
 * 메소드 또는 생성자의 매개변수로 람다의 입력값을 받는다.
 * 리턴값 또는 생성한 객체는 람다의 리턴값이다.
 *
 */