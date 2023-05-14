public class re3 {

    final static int N = 15;

    public static void main(String[] args) {

        /*
        int i = 1, sum = 0;
        while(i <= 1000) {
            sum += i++;
        }
        System.out.println(sum);

        for(int j = N; j > 0; j--) {
            for(int l = j; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        // x^2 + y^2 = r^2
        for (int i = -N; i <= N; i++) {
            for (int j = -N; j <= N; j++) {
                if (i * i + j * j <= N * N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for(;;), while(true) => infinite loop
        // break; 으로 반복문 빠져나올 수 있음음

        int count = 0;
        for(;;) { // while(true) {
            System.out.println("*");
            count++;
            if(count == 10) {
                break;
            }
        }
    }
}

