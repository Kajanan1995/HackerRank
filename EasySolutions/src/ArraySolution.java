import java.util.Scanner;

public class ArraySolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for (int k = 0; k < time; k++) {
			int ele = sc.nextInt();
			int leap = sc.nextInt();
			boolean ans = false;
			int[] arr = new int[ele];
			for (int j = 0; j < ele; j++) {
				arr[j] = sc.nextInt();
			}

		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] == 1) {
				int lev = i + leap;
				if (lev > arr.length - 1) {
					ans = true;
				} else {
					if (arr[lev] == 0) {
						i = i + leap - 1;
					}
				}
			}
			if (arr[i + 1] == 0) {
				count++;
			}
		}
		if (count == arr.length - 1)
			ans = true;

		if (ans == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}}}


