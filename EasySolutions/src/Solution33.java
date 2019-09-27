import java.util.Arrays;
import java.util.Scanner;

public class Solution33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for (int k = 0; k < len; k++) {
			arr[k] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) <= 1) {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);

	}

}
