package ch1_11;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore1 = ++gameScore;
        System.out.println(lastScore1);
        System.out.println(gameScore);
        int lastScore2 = gameScore--;
        System.out.println(lastScore2);
        System.out.println(gameScore);
    }
}
