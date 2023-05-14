public class re7 {

    public static char function(String input) {
        return input.charAt(input.length() - 1);
        // charAt(q): index q 에 있는 character 하나를 가져옴.
    }

    public static void main(String[] args) {
        System.out.println(function("Hello"));
    }
}
