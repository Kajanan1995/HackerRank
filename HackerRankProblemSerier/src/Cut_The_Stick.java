import java.util.Arrays;
import java.util.Scanner;

public class Cut_The_Stick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		int k = 0;
		Arrays.sort(arr);
		boolean valu = true;
		while (valu) {
			int min = 0;

			int count = 0;
			if (arr[k] > 0) {
				min = arr[k];
			} else {
				k++;
			}

			for (int l=0;l<arr.length;l++) {
				arr[l] = arr[l] - min;
				if (arr[l] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if (count == 1) {
				valu = false;
			}

		}
	}

}
