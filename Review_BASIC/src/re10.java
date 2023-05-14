public class re10 {

    /*
    public static int fibonacci(int number) {
        int one = 1;
        int two = 1;
        int result = -1;
        if(number == 1) {
            return one;
        }
        else if(number == 2) {
            return two;
        }
        else {
            for(int i = 2; i < number; i++) {
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }
    */

    public static int fibonacci(int number) {
        if(number == 1) {
            return 1;
        }
        else if(number == 2) {
            return 1;
        }
        else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(10));

    }

}
