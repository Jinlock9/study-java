package FunctionalInterface1;

@FunctionalInterface
public interface RunSomething {

    /*
     * [ 함수형 인터페이스 (Functional Interface) ]
     *  - 추상 메소드를 딱 하나만 가지고 있는 인터페이스
     *  - SAM (Single Abstract Method) 인터페이스
     *  - @FunctionalInterface 애노테이션을 가지고 있는 인터페이스
     *
     */

    void doIt();
    // interface 에서는 abstract 생략 가능

    // java 8 부터는 public static method 에 public 생략 가능

    // 또한 interface 에도 static method 정의 가능
    static void printName() {
        System.out.println("Jinlock");
    }

    // default method 또한 정의 가능
    default void printAge() {
        System.out.println("22");
    }

}