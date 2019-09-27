import java.util.ArrayList;
import java.util.Scanner;

public class Solution26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fir = sc.nextInt();
		int sec = sc.nextInt();
		int arr[] = new int[fir];
		int arr1[] = new int[sec];

		for (int i = 0; i < fir; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < sec; i++) {
			arr1[i] = sc.nextInt();
		}
		int count = 0;
		int count1 = 0;
		int finalcount = 0;
		int last = 0;
		int m = 0;
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		for (int k = arr[arr.length - 1]; k <= arr1[0]; k++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (k % arr[j] == 0) {
					count++;
				}
			}
			if (count == arr.length) {
				li.add(k);
			}
		}

		for (int lt : li) {
			last = 0;
			for (int a : arr1) {
				if (a % lt == 0) {
					last++;
				}
			}
			if (last == arr1.length) {
				finalcount++;
			}
		}

		System.out.println(finalcount);

	}
}
