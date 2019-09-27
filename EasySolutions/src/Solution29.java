import java.util.Arrays;
import java.util.Scanner;

public class Solution29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cap = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[cap];

		for (int l = 0; l < cap; l++) {
			arr[l] = sc.nextInt();
		}
		int count = 0;
		int fincount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < k) {
				count++;
				for (int g = 1; g <= arr[i]; g++) {
					if (count == g) {
						fincount++;
					}
				}

			} else {
				for (int j = 1; j <= arr[i]; j++) {
					if (j % k == 1) {
						count++;
					}
					if (k == 1) {
						count++;
					}
					if (count == j) {
						fincount++;
					}

				}
			}

		}
		System.out.println(fincount);

	}

}
