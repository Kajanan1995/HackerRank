import java.util.HashSet;
import java.util.Scanner;

public class Non_Divisible_Subset_HR39 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HashSet<Integer> ht = new HashSet<Integer>();
        int n = ip.nextInt();
        int km=ip.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        int num = 0;
        /*
         * for(int i=0;i<n-1;i++) { for(int j=i+1;j<n;j++) { if(arr[i]+arr[j]%4!=0) {
         * ht.add(arr[j]); } } }
         */

        for (int k : arr) {
            num = 0;
            for (int el : arr) {
                if (el != k) {
                    if ((k + el) % km!= 0) {
                        ht.add(k);
                    }
                }

            }
        }
        System.out.println(ht.size());

    }

}
