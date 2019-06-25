import java.util.Scanner;

public class Strange_Counter_HR40 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        long st = 3;

        long num = ip.nextLong();
        long k = 1;
        long ans = 0;
        for (long i = 1; i <= num; i++) {

            if (st < 1) {

                st = 3 * (long) Math.pow(2, k);
                k++;
            }
            if (st > 0) {
                ans = st;
                st--;
            }

        }
        System.out.println(ans);

    }

}

