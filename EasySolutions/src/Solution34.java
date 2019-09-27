import java.util.Scanner;

//Array Rotations
public class Solution34 {

	static void arryaRotation(int arr[], int start, int end) {
		while (end > start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	static void rightRotate(int arr[], int d, int n) {
		arryaRotation(arr, 0, n - 1);
		arryaRotation(arr, 0, d - 1);
		arryaRotation(arr, d, n - 1);
	}

	static void printArray(int arr[], int n) {
		System.out.println(arr[n]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ele = sc.nextInt();
		int start = sc.nextInt();
		if(start>=ele)
		{
			start%=ele;
		}
		int qu = sc.nextInt();
		int arr[] = new int[ele];
		for (int i = 0; i < ele; i++) {
			arr[i] = sc.nextInt();
		}
		int end = arr.length;
		rightRotate(arr, start, end);

		for (int j = 0; j < qu; j++) {
			printArray(arr, sc.nextInt());

		}

	}
}
