package Lambda;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Supplier<Integer> get10 = () -> {
            return 10;
        };

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        // BinaryOperator<Integer> sum = (Integer a, Integer b) -> a + b;

        Main main = new Main();
        main.run();
    }

    private void run() {
        //final int baseNumber = 10; // local variable
        // baseNumber 가 사실 상 final 인 경우 final 생략 가능
        // 사실상 final, 즉, effective final 은 프로그램 내에서 변수가 더이상 바뀌지 않는 경우이다.
        int baseNumber = 10;

        // Local Class 에서의 local variable 참조
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        // Anonymous Class 에서의 local variable 참조
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // Lambda 에서의 local variable 참조
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        /*
         * Local Class 와 Anonymous Class 는 Shadowing 가능
         * Lambda 는 Shadowing 이 안됨.
         * 즉, Local 또는 Anonymous class 에 선언된 변수들이
         * 그 class 의 상위 method 나 class 에 선언된 같은 이름의 변수들을 가린다.
         *
         * 위 코드의 LocalClass 와 Anonymous class 는 각각의 scope 를 갖는 반면,
         * lambda 의 scope 은 run() 과 같다.
         *
         * 예를 들어 LocalClass 나 Anonymous class 안에 int baseNumber = 11; 이라고 선언되면,
         * 그 클래스들은 baseNumber 의 값을 10이 아닌 11로 인식한다.
         *
         */
        printInt.accept(10);
    }
}

/*
 * [ 람다 표현식 ]
 *
 * 람다:
 *  (인자 리스트) -> {바디}
 *
 * - 인자 리스트
 *   - 인자가 없을 때: ()
 *   - 인자가 한개일 때: (one) 또는 one
 *   - 인자가 여러개 일 때: (one, two)
 *   - 인자의 타입은 생략 가능, 컴파일러가 추론(infer)하지만 명시할 수도 있다.
 *   - (Integer one, Integer two)
 *
 * - 바디
 *   - 화상표 오른쪽에 함수 본문을 정의한다.
 *   - 여러 줄인 경우에 { }를 사용해서 묶는다.
 *   - 한 줄인 경우에 생략 가능, return 도 생략 가능.
 *
 * - 변수 캡처 (Variable Capture)
 *   - 로컬 변수 캡처
 *     - final 이거나 effective final 인 경우에만 참조할 수 있다.
 *     - 그렇지 않을 경우 concurrency 문제가 생길 수 있어서 컴파일가 방지한다.
 *   - effective final
 *     - 이것도 역시 자바 8부터 지원하는 기능으로 “사실상" final 인 변수.
 *     - final 키워드 사용하지 않은 변수를 익명 클래스 구현체
 *       또는 람다에서 참조할 수 있다.
 *  - 익명 클래스 구현체와 달리 ‘쉐도윙’하지 않는다.
 *    - 익명 클래스는 새로 스콥을 만들지만, 람다는 람다를 감싸고 있는 스콥과 같다
 *
 */