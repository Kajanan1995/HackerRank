import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	int search(int b, int l, int arr[], int x) {

		int m = b + (l - b) / 2;
		if (l >= b) {
			if (arr[m] == x)
				return m;
			if (arr[m] < x)
				return search(m + 1, l, arr, x);
			else
				return search(0, m - 1, arr, x);
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int b = 0;
		int l = arr.length - 1;
		Sample obj = new Sample();
		int position = obj.search(b, l, arr, find);

		if (position == -1)
			System.out.println("");
		else
			System.out.println(position);

	}

}
