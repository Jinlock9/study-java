public class re19 { //extends Parent{

    /*
     * < Final >
     * Stop Value Change
     * Stop Method Overriding
     * Stop Inheritance
     */

    /*
    public void show() {
        System.out.println("Hello!");
    }
    */
    public static void main(String[] args) {
        final int number = 10;
        System.out.println(number);

        re19 re = new re19();
        //re.show();
    }
}
