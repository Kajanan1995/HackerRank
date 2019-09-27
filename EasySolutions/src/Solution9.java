import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int[] arr = new int[n];
		for (int k = 0; k < n; k++) {
			arr[k] = ip.nextInt();
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}

		}
		System.out.println(count);

	}

}
