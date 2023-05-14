package FunctionalInterface2;

/*
 * [ Java 가 기본으로 제공하는 함수형 인터페이스 ]
 *
 *  java.util.function package
 *  - Function<T, R>
 *  - BiFunction<T, U, R>
 *  - Consumer<T>
 *  - Supplier<T>
 *  - Predicate<T>
 *  - UnaryOperator<T>
 *  - BinaryOperator<T>
 *
 */

import java.util.function.*;

public class Main {

    public static void main(String[] args) {


        /*
         * [ Function<T, R> ]
         *
         * Function<입력값의 type, return 값의 type>
         *
         *  - T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
         *    - R apply(T t)
         *
         *  - 함수 조합용 메소드
         *    - andThen
         *    - compose
         *
         */

        // Plus10 plus10 = new Plus10();
        // or
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(multiply2.apply(1));

        // A.compose(B) : B -> A
        Function<Integer, Integer> M2andP10 = plus10.compose(multiply2);
        System.out.println(M2andP10.apply(2));

        // A.andThen(B) : A -> B
        System.out.println(plus10.andThen(multiply2).apply(2));

        /*
         * [ BiFunction<T, U, R> ]
         *
         * 두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스
         *  - R apply(T t, U u)
         *
         */

        /*
         * [ Consumer<T> ]
         *
         * - T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
         *   - void Accept(T t)
         * - 함수 조합용 메소드
         *   - andThen
         *
         */

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        /*
         * [ Supplier<T> ]
         *
         * Supplier<받아올 값의 type>
         *
         * T 타입의 값을 제공하는 함수 인터페이스
         * - T get()
         *
         */

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        /*
         * [ Predicate<T> ]
         *
         * - T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
         *   - boolean test(T t)
         * - 함수 조합용 메소드
         *   - And
         *   - Or
         *   - Negate
         *
         */

        Predicate<String> startsWithJesus = (s) -> s.startsWith("Jesus");
        String str = "Jesus Christ";
        System.out.println(startsWithJesus.test(str));

        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println(isEven.test(180));

        /*
         * [ UnaryOperator<T> ]
         *
         * Function<T, R>의 특수한 형태로, 입력값 하나를 받아서
         * 동일한 타입을 리턴하는 함수 인터페이스
         *
         * 입력값의 타입과 결과값의 타입이 같음.
         *
         */

        UnaryOperator<Integer> plus5 = (i) -> i + 5;
        System.out.println(plus5.apply(5));

        /*
         * [ BinaryOperator<T> ]
         *
         * BiFunction<T, U, R>의 특수한 형태로, 동일한 타입의 입력값 두개를 받아
         * 리턴하는 함수 인터페이스
         *
         */
    }

}
