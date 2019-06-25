import java.util.Scanner;

public class Forming_Magic_Squrare {

	public static void main(String[] args) {
		int arr[][] = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };

		int arr1[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum = Math.abs(arr[i][j] - arr1[i][j]) + sum;
			}
		}
		System.out.println(sum);

	}

}
