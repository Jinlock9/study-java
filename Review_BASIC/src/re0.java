public class re0 {

    final static int INT_MAX = 2147483647;
    // final: once the variable is declared, it is unchangeable
    // static: resource that shared among the class

    /*
     * Overflow:
     * Ex. If you add 1 to Max Integer Value,
     * the value goes to Min Integer Value
     * Ex. 2147483647 + 1 -> -2147483647
     */

    public static void main(String[] args) {

        /*
        int a = 100;
        double b = 100.1;
        String c = "Hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int aa = 50;

        System.out.println("a + b = " + (a + aa));
        System.out.println("a - b = " + (a - aa));

        int bb = (int) 10.5;

        double cc = 0.4;
        int dd = (int) (cc + 0.5); // Rounding off
        System.out.println(dd);
        */

        /*
         * < Data type >
         * - Primitive
         *   - Boolean
         *   - Numeric
         *     - Character
         *       - char : 2 bytes, 0 ~ 65535
         *     - Integral
         *       - Integer
         *         - byte : 1 byte, -2^7 ~ 2^7 -1
         *         - short : 2 bytes, -2^15 ~ 2^15 -1
         *         - int : 4 bytes, -2^31 ~ 2^31 -1
         *         - long : 8 bytes, -2^63 ~ 2^63 -1
         *       - Floating-Point
         *         - float : 4 bytes, -3.4e38 ~ 3.4e38
         *         - double : 8 bytes, -1.7e308 ~ 1.7e308
         * - Non-Primitive
         *   - String
         *   - Array
         *   - etc.
         */

        /*
        double a = 10.3;
        double b = 9.6;
        double c = 10.1;
        System.out.println((a + b+ c) / 3);

        // using ASCII Codes
        for(char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int d = 200;
        double dd = 100.2134423;
        System.out.println("10진수 : " + d);
        System.out.format("8진수 : %o\n", d);
        System.out.format("16진수 : %x\n", d);
        System.out.format("지수 형태(소수점 표기 형식) : %e\n", dd);
        */
        /*
        String name = "John Doe";
        System.out.println(name);
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(3,6));
        System.out.println(name.substring(5,8));
         */
    }
}
