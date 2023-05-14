package FunctionalInterface1;

public class Main {

    public static void main(String[] args) {

        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
                //System.out.println("Lambda");
            }
        };

        // 위의 anonymous inner class 를 아래의 람다 표현식으로 표현 가능
        // RunSomething runSomething = (RunSomething) () -> System.out.println("Hello");
        // 함수형 interface 를 inline 으로 구현한 특수한 object 라 볼 수 있다

        /*
         * [ 람다 표현식 (Lambda Expressions) ]
         *  - 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
         *  - 코드를 줄일 수 있다.
         *  - 메소드 매개변수, 리턴 타입, 변수로 만들어 사용할 수도 있다.
         */

        // or
        /*
         *  RunSomething runSomething = (RunSomething) () -> {
         *      System.out.println("Hello");
         *      System.out.println("Lambda");
         *  };
         */

        runSomething.doIt();

        /*
         * [ JAVA 에서의 함수형 프로그래밍 ]
         *
         *  - 함수를 First class object 로 사용할 수 있다.
         *
         *  - 고차 함수 (Higher-Order Function):
         *    함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
         *    JAVA 에서는 함수가 특수한 형태의 object 이기 때문이다.
         *
         *  - 순수 함수 (Pure function):
         *    사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
         *    상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)
         *
         *  - 불변성
         *
         */

        RunMath runMath = (RunMath) (number) -> {
            return number + 10;
        };
        /*
         * or
         * RunMath runMath = (number) -> return number + 10;
         */
        // 수학적인 함수에서 가장 중요한 것은 입력받은 값이 동일하면 결과가 같아야 한다.
        // 만약 이를 보장하지 못하면 함수형 프로그램이라 보기 어렵다.

        System.out.println(runMath.doMath(1));
        System.out.println(runMath.doMath(1));
        System.out.println(runMath.doMath(1));

        System.out.println(runMath.doMath(2));
        System.out.println(runMath.doMath(2));
        System.out.println(runMath.doMath(2));

        /* 수학적 함수에서 같은 입력값에 따른 동일한 결과가 나올 수 있는
         * 여지가 생길 수 있는 경우는
         *
         * int baseNumber = 10;
         * RunMath runMath = new RunMath() {
         *     // or int baseNumber = 10;
         *
         *     @Override
         *     public int doMath(int number) {
         *         return number + baseNumber;
         *     }
         * };
         * 위와 같이 함수 밖에 상태값 (baseNumber) 에 의존하는 경우
         * 순수한 함수라 볼 수 없다.
         * 또는 외부값 (baseNumber) 을 변경하려는 경우
         */
    }

}
