package ch2.ch2_20;

public class CharArr {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for (char alpha : alphabets) {
            System.out.println(alpha + " : " + (int)alpha);
        }
    }
}
