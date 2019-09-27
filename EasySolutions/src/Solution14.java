import java.util.Scanner;

public class Solution14 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int time = ip.nextInt();
		for (int m = 0; m < time; m++) {
			int count = 0;
			int ele = ip.nextInt();
			int arr[] = new int[ele];
			for (int k = 0; k < ele; k++) {
				arr[k] = ip.nextInt();
			}
			for (int i = 0; i < arr.length - 1; i++) {
				for (int l = 0; l < arr.length - 1 - i; l++) {
					if (arr[l] > arr[l + 1]) {
						int temp = arr[l + 1];
						arr[l + 1] = arr[l];
						arr[l] = temp;
						count++;

					}
				}
			}
			System.out.println(count);

		}
	}

}
