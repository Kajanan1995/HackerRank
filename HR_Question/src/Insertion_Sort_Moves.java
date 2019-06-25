import java.util.Scanner;

public class Insertion_Sort_Moves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong();

        for (int mv = 0; mv < time; mv++) {
            int num = sc.nextInt();
            int arr[] = new int[num];
            int key = 0;
            long count = 0;

            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }

            for (int l = 1; l < num; l++) {
                key = arr[l];
                int j = l - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j -= 1;
                    count++;
                }
                arr[j + 1] = key;
            }
            System.out.println(count);

        }

    }
}
