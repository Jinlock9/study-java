public class re2 {

    public static void main(String[] args) {

        String a = "I Love You.";
        if(a.contains("Love")) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        int score = 95;

        if(score >= 90) {
            System.out.println("A");
        }
        else if(score >= 80) {
            System.out.println("B");
        }
        else if(score >= 70) {
            System.out.println("C");
        }
        else if(score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

        String b = "Man";
        int c = 0;

        // Java uses equal() to compare Strings
        if(b.equals("Man")) {
            System.out.println("Man");
        }
        else {
            System.out.println("Not a Man");
        }

        if(c == 3) {
            System.out.println("c is 3");
        }

        if(b.equalsIgnoreCase("man")) { // ignoring Capitol Cases
            System.out.println("Man");
        }
    }


}
