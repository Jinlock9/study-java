package MathClass;

public class Main {

    /*
     * [ Math Class ]
     * 수학 계산을 위한 class
     *
     *  - cos
     *  - sin
     *  - tan
     *  - abs
     *  - random
     *  - etc.
     *
     * Math class 는 constructor 자체가 private 이라 new 연산자로 객체 생성 불가
     * 그러나 모든 methods와 속성이 static 이라 객체 생성 없이 사용 가능
     *
     */

    public static void main(String[] args) {

        int v1 = Math.max(5, 30);
        System.out.println(v1);
        // '30'

        int v2 = Math.min(5, 30);
        System.out.println(v2);
        // '5'

        System.out.println(Math.abs(-10));
        // '10'

        System.out.println(Math.random());
        // return 값은 double type
        // 0 이상 1.0 미만의 실수 값 return

        System.out.println(Math.sqrt(25));
        // '5.0'

    }

}
