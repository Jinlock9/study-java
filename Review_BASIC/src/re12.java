public class re12 {

    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            // Math.random -> 0 ~ 0.xxxx
        }
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            sum += array[i];
        }
        System.out.println(sum / 100);
    }

}
